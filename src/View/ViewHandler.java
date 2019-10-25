package View;
import Controller.ControllerMenu;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ViewHandler extends Application {
        private Stage primaryStage;
        private ViewMenuPrincipal menuPincipal;
        private ViewMenuOption menuOption;
        private ControllerMenu controllerMenu;
        private Menu model;



        @Override
        public void start(Stage primaryStage) {
            int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
            int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

            Group root = new Group();
            Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);
            model = new Menu();

            menuPincipal = new ViewMenuPrincipal(model, root);
            //menuOption = new ViewMenuOption(root);
            controllerMenu = new ControllerMenu(this, model);

            primaryStage.setTitle("NOTRE INTERFACE");
            primaryStage.setResizable(false);
            primaryStage.setFullScreen(true);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public void afficherMenuPrincipal(){
            menuPincipal.setVueCompletMenu();
        }


    //Getters et Setters
    public void setPrimaryStage(Stage primaryStage) { this.primaryStage = primaryStage; }

    public ViewMenuPrincipal getMenuPincipal() { return menuPincipal; }

    public void setMenuPincipal(ViewMenuPrincipal menuPincipal) { this.menuPincipal = menuPincipal; }

    public ViewMenuOption getMenuOption() { return menuOption; }

    public void setMenuOption(ViewMenuOption menuOption) { this.menuOption = menuOption; }

    public ControllerMenu getControllerMenu() { return controllerMenu; }

    public void setControllerMenu(ControllerMenu controllerMenu) { this.controllerMenu = controllerMenu; }

    public Menu getModel() { return model; }

    public void setModel(Menu model) { this.model = model; }

    public Stage getPrimaryStage() { return primaryStage; }


}