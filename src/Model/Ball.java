package Model;

import Controller.ControllerJeu;
import javafx.scene.image.ImageView;

public class Ball extends ControllerJeu {

    private int xdir;
    private int ydir;

    public final static String ball = "Asset/Images/sprites/ball.png";
    private final ImageView ballDuPaddle;

    public Ball(int x, int y){
        ballDuPaddle = new ImageView(ball);
        ballDuPaddle.setX(x);
        ballDuPaddle.setY(y);
    }

    public ImageView getBallDuPaddle(){
        return ballDuPaddle;
    }

    public  Ball(ImageView ballDuPaddle) {
        this.ballDuPaddle = ballDuPaddle;
       // xdir = 1;
       // ydir = -1;
        //resetState();
    }

    public void deplacement()
    {
        ballDuPaddle.setY(ballDuPaddle.getY()-10);
        //x += xdir;
        //y += ydir;
/*
        if (x == 0) {
            setXDir(1);
        }


        if (y == 0) {
            setYDir(1);
        }*/
    }

    public int getX(){
        return (int) ballDuPaddle.getX();
    }

    public int getY(){
        return (int) ballDuPaddle.getY();
    }

    public String toString(){
        return ballDuPaddle.getX() + " " + ballDuPaddle.getY();
    }

/*
    public void resetState()
    {
        x = 230;
        y = 355;
    }

    public void setXDir(int x)
    {
        xdir = x;
    }

    public void setYDir(int y)
    {
        ydir = y;
    }

    public int getYDir()
    {
        return ydir;
    }*/
}
