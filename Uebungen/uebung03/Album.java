package de.rub.LinAmpPlayer;

import java.util.ArrayList;

public class Album extends PlayableItem {
    protected ArrayList<Track> tracks = new ArrayList<>();  // tracks

    public Album(String albumTitle, String artistAlbum) {
        super(albumTitle, artistAlbum);
    }


    /**
     * Updates the length of the album by calculating the sum of track lengths
     * Developer Note: Call this after adding tracks!
     */
    public void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.length;
        }
    }
}
