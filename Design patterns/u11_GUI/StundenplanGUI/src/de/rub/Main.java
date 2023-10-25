package de.rub;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    UniPlanerGUI gui = new UniPlanerGUI();
                    gui.setVisible(true);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
