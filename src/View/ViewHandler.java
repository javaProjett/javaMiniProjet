package View;
import Controller.ControllerJeu;
import Controller.ControllerMenu;
import Controller.ControllerOption;
import Outils.Music;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;



public class ViewHandler extends Application {
        private Stage primaryStage;
        private ViewMenu menu;
        private ViewOption option;
        private ViewJeu jeu;
        private ControllerMenu controllerMenu;
        private ControllerJeu controllerJeu;
        private Menu model;
        private Group root;


        @Override
        public void start(Stage primaryStage) {
            this.primaryStage = primaryStage;

            int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
            int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
            root = new Group();
            Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);
            model = new Menu();
            menu = new ViewMenu(model, root);
            option = new ViewOption(root, this );
            jeu = new ViewJeu(model, root);

            controllerMenu = new ControllerMenu(this, model);
            //controllerJeu = new ControllerJeu(this);
            afficherMenuPrincipal();
            Music.playMainMenuMusic();
            primaryStage.setTitle("NOTRE INTERFACE");
            primaryStage.setResizable(false);
            primaryStage.setFullScreen(true);
            primaryStage.setScene(scene);

            primaryStage.show();
        }

        public void afficherMenuPrincipal(){

            menu.setVueCompletMenu();
        }



    //Getters et Setters
    public Stage getPrimaryStage() {
            return primaryStage;
        }
    public ViewMenu getMenu() {
            return menu;
        }
    public ViewOption getOption() {
            return option;
        }
    public ViewJeu getJeu(){
            return jeu;
    }
    public void setVueCompletMenu(){
            menu.setVueCompletMenu();
    }
    public void setVueJeu(){
            jeu.afficherJeu();
    }
    public void setVueOption(){
            option.setVueOption();
    }
    public void setEventHandlerMenu(ControllerMenu controllerMenu){
            menu.setEvents(controllerMenu);
            option.setEvents(controllerMenu);
            option.setVueOption();
    }


}