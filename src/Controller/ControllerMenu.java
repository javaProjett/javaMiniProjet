package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

public class ControllerMenu implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Menu model;

    public ControllerMenu(ViewHandler launcher, Menu model) {
            this.model = model;
            this.launcher = launcher;
            this.launcher.setEventHandlerMenu(this);

    }
    @Override
    public void handle(MouseEvent event){
        if(event.getSource().equals(launcher.getMenu().getLancerJeu())){
            launcher.setVueJeu();
        }else if(event.getSource().equals(launcher.getMenu().getLancerOption())){
            launcher.setVueOption();
        }else if(event.getSource().equals(launcher.getMenu().getLancerQuitter())){
            launcher.getPrimaryStage().close();
        }
        else if(event.getSource().equals(launcher.getOption().getRetourMenu())){
            launcher.setVueCompletMenu();
        }
    }
}
