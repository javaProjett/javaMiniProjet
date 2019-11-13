package Controller;

import Model.Option;
import View.ViewHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;


public class ControllerJeu {

    private ViewHandler launcher;
    private Option option;


    public synchronized void moveLeft() {
        launcher.moveLeft();
    }

    public synchronized void moveRight() {
        launcher.moveRight();
    }


}
