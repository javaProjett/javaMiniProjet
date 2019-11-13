package View;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.scene.text.Font;

import java.io.File;


public class ViewMenu {
    private Group root;
    private  ImageView imgBg;
    private Text jouer, option, quitter, titre;
    private Menu model;

    ViewMenu(Menu model, Group root) {
        this.root = root;
        this.model = model;

        initBackground();
        texteMenu();
        musicMenu();
    }

    private void initBackground() {
        imgBg = new ImageView("Asset/Images/crane.jpeg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }
    private void texteMenu(){
        titre = new Text(250, 100, "LA MUERTE");
        titre.setFont(new Font("Arial", 100));
        titre.setFill (Color.WHITE);
        ///
        jouer = new Text(150, 450,"Jouer");
        jouer.setFont(new Font("Arial", 25));
        jouer.setFill (Color.WHITE);
        ///
        option = new Text(150, 600, "Options");
        option.setFont(new Font("Arial", 25));
        option.setFill (Color.WHITE);

        ////
        quitter = new Text(150, 750, "Quitter");
        quitter.setFont(new Font("Arial", 25));
        quitter.setFill (Color.WHITE);
    }
    private void musicMenu(){

    }
     void setVueCompletMenu(){
         root.getChildren().clear();
         final File file = new File("src/Sons/A.M.T. - Xenon.2.mp3");
         final Media media = new Media(file.toURI().toString());
         final MediaPlayer mediaPlayer = new MediaPlayer(media);
         mediaPlayer.setAutoPlay(true);
         MediaView mediaView = new MediaView(mediaPlayer);
         root.getChildren().add(mediaView);
         root.getChildren().addAll(imgBg);
         root.getChildren().add(titre);
         root.getChildren().add(jouer);
         root.getChildren().add(option);
         root.getChildren().add(quitter);

    }
    public Text getLancerJeu() {
        return jouer;
    }


    public Text getLancerOption(){
        return option;
    }
    public Text getLancerQuitter(){
        return quitter;
    }

    void setEvents(ControllerMenu controllerMenu){
        jouer.setOnMouseClicked(controllerMenu);
        option.setOnMouseClicked(controllerMenu);
        quitter.setOnMouseClicked(controllerMenu);
    }
}

