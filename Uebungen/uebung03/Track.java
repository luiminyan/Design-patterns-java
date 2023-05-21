package de.rub.LinAmpPlayer;

public class Track extends PlayableItem {
    protected String album;  // track album

    public Track(String trackTitle, String artistTrack, String album, int length) {
        super(trackTitle, length, artistTrack);
        this.album = album;
    }

}
