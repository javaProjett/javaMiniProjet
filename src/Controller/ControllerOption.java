package Controller;

import Model.Option;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerOption implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Option model;

    public ControllerOption(ViewHandler viewHandler, Option model){
        this.model = model;
        this.launcher = viewHandler;
        //this.launcher.setEventHandlerOption(this);
    }

    @Override
    public void handle(MouseEvent event) {
        /*if (event.getSource().equals(launcher.getvOption().getBtnBackMainP2())) {
            launcher.setMenuView();
        }*/

    }



}
