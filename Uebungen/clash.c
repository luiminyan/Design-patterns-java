/*I----> +--------------------------------------------------------------------+
         | Wir haben in dieser Abgabe ein Plagiat festgestellt und werden die |
         | Abgabe daher  weder  korrigieren  noch  bepunkten.  Es  dürfen nur |
         | vollständig eigenständig  erarbeitete  Lösungen  abgegeben werden; |
         | das  Ausgeben  von  fremden  Bestandteilen  (ehem. Musterlösungen, |
         | andere Gruppe, etc.)  als eigene Arbeit ist  unzulässig und stellt |
         | ggf. einen Betrugsversuch dar.                                     |
         |                                                                    |
         | Aus diesem Grund setzen wir die bisher erreichten Übungspunkte auf |
         | 0 zurück. Da es sich um den ersten Vorfall handelt, geben wir euch |
         | jedoch die Möglichkeit für die verbleibenden Aufgaben Übungspunkte |
         | und ggf. Bonuspunkte zu sammeln.                                   |
         |                                                                    |
         | Sollte es  sich eurer Meinung  nach nicht um  ein Plagiat handeln, |
         | könnt ihr euch via bs-orga@lists.rub.de an uns wenden. (-18)       |
         +-------------------------------------------------------------------*/


/*
 * Gruppe: T02.05
 * Daeun Jung 108021240517
 * Minhua Liu 108020210282
 */

#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdbool.h>

#include "plist.h"

#define MAX_LINE 1337

// Fehlerbehandlung
static void die(const char *p){
    perror(p);
    exit(EXIT_FAILURE);
}

// Exitstatus ausgeben
static void print_exit(char *buf, int status){
    if(WIFEXITED(status)){
        printf("Exitstatus [%s] = %d\n", buf, WEXITSTATUS(status));
    }else{
        printf("No Exit Status [%s]\n", buf);
    }
}

// laufende Hintergrundprozesse ausgeben
static bool print_job(pid_t pid, const char *buf){
    printf("%d %s\n", (int) pid, buf);
    return 0;
}

// Zombies aufsammeln
static void collect_zombies(void){
    int status;
    pid_t pid;

    // While-Schleife, um zu wissen wie viele Kinder (Zombies) aufgesammelt werden müssen
    // waitpid gibt positive Zahl zurück, wenn ein Kind gerade terminiert ist.
    //              -1                  , wenn ein Fehler aufgetreten ist.
    //              0                   , wenn kein Kind gerade fertig ist.
    while((pid= waitpid(-1, &status, WNOHANG)) != 0){
        if(pid < 0){
            if(errno == ECHILD){
                break;
            }
            die("waitpid");
        }

        // Kind im Hintergrundprozess aus einer verketteten Liste löschen
        char buf[MAX_LINE +1]; // +1 für 0 byte
        if(removeElement(pid, buf, sizeof(buf))<0){
            continue;
        }

        // Exitstatus ausgeben
        print_exit(buf, status);
    }
}


// Prompt ausgeben
static void print_prompt(void){

    // Speicherplatz belegen
    size_t len = 4096;
    char *cwd = NULL;

    while(1){
        cwd = realloc(cwd, len);

        // Falls Allokierung schiefgeht
        if(cwd==NULL){
            die("realloc");
        }

        // Fehler prüfen (getcwd gibt bei Fehler NULL zurück)
        if(getcwd(cwd, len)!= NULL){
            break;
        }

        // Falls die Puffergröße zu klein ist
        if(errno != ERANGE){
            die("getcwd");
        }

        len *= 2;
    }

    printf("%s: ", cwd);
    fflush(stdout);
    free(cwd);
}

int main(void){
    // Benutzereingabe dauerhaft einnehmen, bis Ctrl-D gedrückt wird.
    while(1){
        // Zombies einsammeln
        collect_zombies();
        // Prompt ausgeben
        print_prompt();

        // Zeile (max. 1337 Zeichen lang) von stdin einlesen
        char buf[MAX_LINE+1];
        if(fgets(buf, sizeof(buf), stdin)==NULL){ // Fehlerbehanldung
            if(feof(stdin)){
                break;
            }
            die("fgets");
        }

        // Überlange Zeilen: mit Warnung verwerfen
        if(strlen(buf)==MAX_LINE && buf[MAX_LINE-1] != '\n'){
            fprintf(stderr, "Input line is too long\n");

            int ch;
            do{
                ch = fgetc(stdin);
            }while(ch!=EOF && ch !='\n');
            continue;
        }

        // Leere Zeile: ignorieren
        if(strlen(buf) < 2){
            continue;
        }

        // Newline Zeichen entfernen
        buf[strlen(buf)-1] = '\0';

        // Befinden wir uns jetzt im Hintergrund- oder Vordergrundprozess?
        bool is_background = false;
        if(buf[strlen(buf)-1] == '&'){
            buf[strlen(buf)-1] = '\0';
            is_background = true;
        }

        char cpy[sizeof(buf)];
        strcpy(cpy, buf);

        // Eingabezeile zerlegen
        // MAX_LINE/2 für jedes zweite Zeichen (excl. leere Buchstabe)
        // erstes +1, wenn wir nur ein Zeichen haben
        // zweites +1 für NULL Zeichen, weil strtok am Ende NULL zurückgibt
        char *argv[MAX_LINE/2 +1 +1];
        int i = 0;
        argv[i++] = strtok(buf, " \t");
        while((argv[i++]=strtok(NULL, " \t")) != NULL){
            continue;
        }

        // 1. Kein Kommando
        if(argv[0]==NULL){
            continue;
        }

        // 2. Kommando cd
        if(strcmp(argv[0], "cd") == 0){
            if(argv[1] == NULL || argv[2] != NULL){
                fprintf(stderr, "usage: cd <directory>\n");
            }else if(chdir(argv[1]) != 0){ // Fehlerbehandlung
                perror("chdir");
            }
            continue;
        }

        // 3. Kommando jobs
        if(strcmp(argv[0], "jobs") == 0){
            if(argv[1] == NULL){
                fprintf(stderr, "usage: jobs\n");
            }else{
                // Wir laufen mit walkList über die Listenelemente und für jedes Element rufen wir print_job
                walkList(print_job);
            }
            continue;
        }

        // Prozess erzeugen, Kommando ausführen
        pid_t pid = fork();
        if(pid < 0){ //Fehlerfall
            die("fork");
        }else if(pid == 0){ // Kindprozess
            execvp(argv[0], argv);
            die("exec");
        }

        // Hintergrundprozess: PID und Kommando in Liste merken und weitermachen
        if(is_background){
            if(insertElement(pid, cpy) == -2) { // Fehlerbehandlung
                fprintf(stderr, "out of memory");
                exit(EXIT_FAILURE);
            }
        }else{
            int status;
            if(waitpid(pid, &status, 0)<0){
                die("waitpid");
            }
            print_exit(cpy, status);
        }
    }
}


/*P----> +--------------------------------------------------------------------+
         | Punktabzug in dieser Datei: 18.0 Punkte                            |
         +-------------------------------------------------------------------*/
