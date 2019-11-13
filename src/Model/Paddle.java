package Model;
import javafx.scene.image.ImageView;

public class Paddle {
    public final static String paddle = "Asset/Images/sprites/paddle.png";

    private ImageView skinPaddle;

    public Paddle(String  skinPaddle) {
        this.skinPaddle = new ImageView(skinPaddle);
    }


    public ImageView getSkinPaddle() {
        return skinPaddle;
    }

    public void setSkinPaddle(ImageView skinPaddle) {
        this.skinPaddle = skinPaddle;
    }



}
