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


    public ControllerKeyboard(ViewHandler viewHandler, Jeu jeu) {
        this.viewHandler = viewHandler;
        this.jeu = jeu;
        viewHandler.getJeu().setKeyboardController(this);
        niveauEnCours = jeu.niveauEnCours();
    }

    @Override
    public void handle(KeyEvent event) {

        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {
                viewHandler.getJeu().moveBareLeft();
            } else if (event.getCode() == KeyCode.RIGHT) {
                viewHandler.getJeu().moveBareRight();
            } else if (event.getCode() == KeyCode.SPACE) {
            }
        }
    }

    public synchronized void moveLeft() {
        viewHandler.moveLeft();
    }

    public synchronized void moveRight() {
        viewHandler.moveRight();
    }


}
