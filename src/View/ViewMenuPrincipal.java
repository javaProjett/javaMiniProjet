package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;

public class ViewMenuPrincipal{
    private Group root;
    private Menu model;
    private  ImageView imgBg;
    private  Button btnJouer;
    private  Button btnOption;
    private  Button btnQuitter;


    ViewMenuPrincipal(Menu model, Group root) {
        this.root = root;
        this.model = model;



        initBackground();
        btnJouer = initButton(750, 85, "Jouer", 120, 30, "Indie flower", 20);
        btnOption = initButton(950, 85, "Option", 120, 30, "Indie flower", 20);
        btnQuitter = initButton(1150, 85, "Quitter", 120, 30, "Indie flower", 20);
        setVueCompletMenu();
    }
     void setVueCompletMenu(){
        root.getChildren().clear();
        root.getChildren().addAll(imgBg);
        root.getChildren().add(btnJouer);
        root.getChildren().add(btnOption);
        root.getChildren().add(btnQuitter);
    }

    public ViewMenuPrincipal(ViewMenuPrincipal menuPincipal) {
    }


    private void initBackground() {
        imgBg = new ImageView("Asset/Images/crane.jpeg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());

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


    public Menu getModel() {
        return model;
    }

    public void setModel(Menu model) {
        this.model = model;
    }

}

