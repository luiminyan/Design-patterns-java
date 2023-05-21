package de.rub.LinAmpPlayer;

import java.util.ArrayList;

public class PlayableItem {
    //attribute
    protected String title;
    protected int length;
    protected String artist;


    //constructor
    public PlayableItem(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public PlayableItem(String title, int length, String artist){
        this.title = title;
        this.length = length;
        this.artist = artist;
    }

    public String getDescription() {
        return title + " by " + artist + " (" + getRuntimeString(length) + ")";
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    public static String getRuntimeString(int timeInSeconds) {
        int tAbs = Math.abs(timeInSeconds);
        if(timeInSeconds >= 60 * 60) {
            int hours = Math.floorDiv(tAbs, 60 * 60);
            int minutes = Math.floorDiv(tAbs % (60 * 60), 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            int minutes = Math.floorDiv(tAbs, 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}
