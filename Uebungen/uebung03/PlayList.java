package de.rub.LinAmpPlayer;

import java.util.ArrayList;

public class PlayList {
    protected String listName;
    protected ArrayList<PlayableItem> thePList= new ArrayList<>();

    //constructor
    public PlayList(String listName){
        this.listName = listName;
    }

}
