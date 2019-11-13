package Controller;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;


public class ControllerJeu {
    public static final int BOTTOM = 390;
    public static final int PADDLE_RIGHT = 250;
    public static final int BALL_RIGHT = 280;
    protected int x;
    protected int y;
    protected double width;
    protected double height;
    protected Image image;


    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    Image getImage(){
        return image;
    }
    public Rectangle2D getRect(){
        return new Rectangle2D(x, y,
                image.getWidth(), image.getHeight());
    }
}
