package Controller;

import View.ViewHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;


public class ControllerJeu {
    protected int x;
    protected int y;
    protected double width;
    protected double height;
    protected Image image;
    private ViewHandler viewHandler;

/*
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
*/
    public synchronized void moveLeft() {
        viewHandler.moveLeft();
    }

    public synchronized void moveRight() {
        viewHandler.moveRight();
    }


}
