package View;

import Controller.ControllerMenu;
import Controller.ControllerOption;
import Outils.Music;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewOption {
    private Group root;
    private ViewHandler viewOption;
    private ImageView imgBg;
    private Text audio, titreOption, menuPrincipal;
    private Menu model;
    private Slider volumeSlider;

    ViewOption(Group root, ViewHandler viewOption){
        this.root = root;
        //this.model = model;
        this.viewOption = viewOption;

        initBackground();
        texteMenuOption();
        btnVolume(100, 630);
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

        ///
        audio = new Text(150, 600,"Audio");
        audio.setFont(new Font("Arial", 25));
        audio.setFill (Color.WHITE);

        ////
        menuPrincipal = new Text(150, 750, "Menu Principal");
        menuPrincipal.setFont(new Font("Arial", 25));
        menuPrincipal.setFill (Color.WHITE);
    }
    private void btnVolume(int largeur, int longueur){
        volumeSlider= new Slider(0,100,100);
        volumeSlider.setBlockIncrement(10);
        volumeSlider.setShowTickLabels(true);
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> Music.setVolume(newValue.intValue() / 100.));
        volumeSlider.setLayoutX(largeur);
        volumeSlider.setLayoutY(longueur);
    }
    void setVueOption(){
        root.getChildren().clear();
        root.getChildren().addAll(imgBg);
        root.getChildren().add(audio);
        root.getChildren().add(titreOption);
        root.getChildren().add(menuPrincipal);
        root.getChildren().add(volumeSlider);
        root.getStylesheets().add(getClass().getResource("../Asset/css/slider.css").toExternalForm());;
    }

    public Text getRetourMenu() {
        return menuPrincipal;
    }
    void setEvents(ControllerMenu controllerMenu){
        menuPrincipal.setOnMouseClicked(controllerMenu);
    }


}