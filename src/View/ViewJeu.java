package View;

import Controller.ControllerKeyboard;
import Model.Ball;
import Model.Briques;
import Model.Jeu;
import Model.Paddle;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;

public class ViewJeu {
    private Group root;
    private ViewHandler viewHandler;
    private ImageView brickImage, skinPaddle, ballImage;
    private List<ImageView> brickListe;
    private Paddle paddle;
    private Ball ball;
    private Jeu jeu;
    private ImageView imageDeFond;
    private double vitesse = 10;
    private Rectangle2D primaryScreenBounds;
    private List<Ball> listeDeBall;


    ViewJeu(ViewHandler viewHandler, Group root) {
        jeu = new Jeu();
        this.root = root;
        this.viewHandler = viewHandler;
        primaryScreenBounds = Screen.getPrimary().getBounds();
        listeDeBall = new ArrayList<>();

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
        initBackground();
        afficherJeu();

    }


    public void afficherJeu() {
        root.getChildren().clear();
        brickListe = new ArrayList<>();
        int sautDeLigne = 50;
        root.getChildren().addAll(imageDeFond);
        for (int i = 0; i < jeu.niveauEnCours().getNombreBriques(); i++) {
            if (i % 10 == 0) {
                sautDeLigne = sautDeLigne + 50;
            }
            brickListe.add(jeu.niveauEnCours().getBriquesList().get(i).getSkin());
            brickListe.get(i).setX((150 * (i % 10)) + 150);
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

    private void initBackground() {
        imageDeFond = new ImageView("Asset/Images/retro.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    public void moveBareLeft() {
        skinPaddle.setX(skinPaddle.getX() - vitesse);
    }

    public void moveBareRight() {
        skinPaddle.setX(skinPaddle.getX() + vitesse);
    }

    public void setKeyboardController(ControllerKeyboard controllerKeyboard) {
        root.getScene().setOnKeyPressed(controllerKeyboard);
    }

    public void moveBall() {
        ballImage.setY(ballImage.getX() + vitesse);

        double x = 0;
        double maxY = primaryScreenBounds.getHeight() / 1.70;
        double minY = 0;
        double range = maxY - minY;
        double y = (Math.random() * range) + minY;
        char direction = Math.random() * 10 + 1 > 5 ? '+' : '-';

        if (direction == '+') {
            x = -20;
        } else {
            y = primaryScreenBounds.getWidth() + 20;
        }
        int speed = (int) (Math.random() * 10 + 2);
        Ball ball = new Ball((int) x, (int) y, speed, direction);
        listeDeBall.add(ball);
        root.getChildren().add(ball.getBallDuPaddle());
    }


}
