package View;

import Model.Ball;
import Model.Briques;
import Model.Jeu;
import Model.Paddle;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ViewJeu {
    private Group root;
    private Menu model;
    private ImageView brickImage, skinPaddle, ballImage;
    private List<ImageView> brickListe;
    private Paddle paddle;
    private Ball ball;
    private Jeu jeu;




    ViewJeu(Menu model, Group root){
        jeu = new Jeu();
        this.root = root;
        this.model = model;


        brickImage = new ImageView(Briques.laBrick);
        skinPaddle = new ImageView(Paddle.paddle);
        ballImage = new ImageView(Ball.ball);

        brickImage.setX(-200);
        brickImage.setY(150);

        skinPaddle.setX(800);
        skinPaddle.setY(1000);
        int posX = 800;

        ballImage.setX(posX);
        ballImage.setY(980);

        afficherJeu();

    }




    public void afficherJeu(){
        root.getChildren().clear();
        brickListe = new ArrayList<>();
        int sautDeLigne = 50;
        for (int i = 0; i < jeu.niveauEnCours().getNombreBriques(); i++) {
            if(i % 10 == 0){
                sautDeLigne = sautDeLigne + 50;
            }
            brickListe.add(jeu.niveauEnCours().getBriquesList().get(i).getSkin());
            brickListe.get(i).setX((150 * (i % 10))+150);
            brickListe.get(i).setY(sautDeLigne);
            brickListe.get(i).setFitWidth(100);
            brickListe.get(i).setFitHeight(25);
            root.getChildren().add(brickListe.get(i));
        }

        root.getChildren().add(skinPaddle);
        root.getChildren().add(ballImage);
        skinPaddle.setFitWidth(100);
        skinPaddle.setFitHeight(25);
        ballImage.setFitWidth(20);
        ballImage.setFitHeight(20);

    }

}
