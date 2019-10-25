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

            controllerMenu = new ControllerMenu(this, model);

            menuPincipal = new ViewMenuPrincipal(menuPincipal);
            primaryStage.setTitle("NOTRE INTERFACE");
            primaryStage.setResizable(false);
            primaryStage.setFullScreen(true);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public Stage getPrimaryStage() { return primaryStage; }

        public ViewMenuPrincipal getMenuPrincipal() {
            return menuPincipal;
        }
    }