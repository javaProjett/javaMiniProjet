package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;

public class ViewMenuOption {
    private Group root;
    private ImageView imgBg;
    private Button btnVideoSetting;
    private Button btnAudioSetting;
    private Button btnRetour;

    ViewMenuOption(Group root){
        this.root = root;
        initBackground();

        btnVideoSetting = initButton(750, 85, "Video reglages", 120, 30, "Indie flower", 20);
        btnAudioSetting = initButton(950, 85, "Audio reglages", 120, 30, "Indie flower", 20);
        root.getChildren().clear();
        root.getChildren().add(btnVideoSetting);
        root.getChildren().add(btnAudioSetting);
    }

    private Button initButton(int posX, int posY, String texteBtn, int tailleBtnW, int tailleBtnH, String police, int taillePolice) {
        Button b = new Button();
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setText(texteBtn);
        b.setFont(new Font(police, taillePolice));
        b.setFont(Font.font(police, FontWeight.BOLD, FontPosture.REGULAR, taillePolice));
        b.setPrefSize(tailleBtnW, tailleBtnH);
        return b;
    }

    private void initBackground() {
        ImageView imgBg = new ImageView("Asset/Images/crane.jpeg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }


}
