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
        afficherJeu();
        setVueJeu();

    }

    void setVueJeu(){
        root.getChildren().clear();

        brickImage = new ImageView(Briques.laBrick);
        skinPaddle = new ImageView(Paddle.paddle);
        ballImage = new ImageView(Ball.ball);

        brickImage.setX(-200);
        brickImage.setY(150);
        skinPaddle.setX(-210);
        skinPaddle.setY(155);
        ballImage.setX(-220);
        ballImage.setY(160);

        root.getChildren().add(brickImage);
        root.getChildren().add(skinPaddle);
        root.getChildren().add(ballImage);

    }


    public void afficherJeu(){
        root.getChildren().clear();
        brickListe = new ArrayList<>();
        paddle = new Paddle(Paddle.paddle);
        //ball = new Ball(Ball.ball);

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

            //skinPaddle.
            //brickListe.add(jeu.niveauEnCours().getBriquesList().get(i).getSkin());

           // root.getChildren().add(skinPaddle);
            //root.getChildren().add(ballImage);





        }

    }

}
