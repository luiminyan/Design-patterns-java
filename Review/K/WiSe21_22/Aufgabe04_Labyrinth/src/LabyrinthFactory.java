public class LabyrinthFactory {
    public Labyrinth createStandardLabyrinth(){
        return new Labyrinth(5, 5);
    }

    public Labyrinth createCustomLabyrinth(int x, int y){
        return new Labyrinth(x, y);
    }
}
