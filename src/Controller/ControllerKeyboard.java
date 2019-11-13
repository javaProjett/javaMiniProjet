package Controller;

        import Model.Jeu;
        import Model.Niveau;
        import View.ViewHandler;
        import javafx.beans.property.BooleanProperty;
        import javafx.beans.property.SimpleBooleanProperty;
        import javafx.event.EventHandler;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;

public class ControllerKeyboard implements EventHandler<KeyEvent> {

    private ViewHandler viewHandler;
    private Jeu jeu;
    private Niveau niveauEnCours;


    private BooleanProperty leftKeyTyped, rightKeyTyped, spaceBarKeyTyped;

    public ControllerKeyboard(ViewHandler viewHandler, Jeu jeu) {
        leftKeyTyped = new SimpleBooleanProperty(false);
        rightKeyTyped = new SimpleBooleanProperty(false);
        spaceBarKeyTyped = new SimpleBooleanProperty(false);
        this.viewHandler = viewHandler;
        this.jeu = jeu;
        niveauEnCours = jeu.niveauEnCours();
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {
                leftKeyTyped.set(true);
            } else if (event.getCode() == KeyCode.RIGHT) {
                rightKeyTyped.set(true);
            } else if (event.getCode() == KeyCode.SPACE) {
                spaceBarKeyTyped.set(true);
            }
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
            if (event.getCode() == KeyCode.LEFT) {
                leftKeyTyped.set(false);
            } else if (event.getCode() == KeyCode.RIGHT) {
                rightKeyTyped.set(false);
            } else if (event.getCode() == KeyCode.SPACE) {
                spaceBarKeyTyped.set(false);
            }
        }
    }

    public synchronized void moveLeft() {
        viewHandler.moveLeft();
    }

    public synchronized void moveRight() {
        viewHandler.moveRight();
    }



    public synchronized boolean isLeftKeyTyped() {
        return leftKeyTyped.get();
    }

    public synchronized boolean isRightKeyTyped() {
        return rightKeyTyped.get();
    }

    public synchronized boolean isSpaceBarKeyTyped() {
        return spaceBarKeyTyped.get();
    }


}
