package View;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewOption {
    private Group root;
    private ImageView imgBg;
    private Text audio, video, titreOption, menuPrincipal;
    private Menu model;

    ViewOption(Menu model, Group root){
        this.root = root;
        this.model = model;

        initBackground();
        texteMenuOption();
    }
    private void initBackground() {
        imgBg = new ImageView("Asset/Images/crane.jpeg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }
    private void texteMenuOption(){
        titreOption = new Text(250, 100, "Menu option");
        titreOption.setFont(new Font("Arial", 100));
        titreOption.setFill (Color.WHITE);
        ///
        ///
        video = new Text(150, 450,"Video");
        video.setFont(new Font("Arial", 25));
        video.setFill (Color.WHITE);
        ///
        audio = new Text(150, 600,"Audio");
        audio.setFont(new Font("Arial", 25));
        audio.setFill (Color.WHITE);

        ////
        menuPrincipal = new Text(150, 750, "Menu Principal");
        menuPrincipal.setFont(new Font("Arial", 25));
        menuPrincipal.setFill (Color.WHITE);
    }
    void setVueOption(){
        root.getChildren().clear();
        root.getChildren().addAll(imgBg);
        root.getChildren().add(audio);
        root.getChildren().add(video);
        root.getChildren().add(titreOption);
        root.getChildren().add(menuPrincipal);
    }

    public Text getRetourMenu() {
        return menuPrincipal;
    }
    void setEvents(ControllerMenu controllerMenu){
        menuPrincipal.setOnMouseClicked(controllerMenu);
    }
}