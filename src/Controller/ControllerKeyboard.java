package Controller;

        import Model.Jeu;
        import Model.Niveau;
        import View.ViewHandler;
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
        viewHandler.getViewJeu().setKeyboardController(this);
        niveauEnCours = jeu.niveauEnCours();
    }

    @Override
    public void handle(KeyEvent event) {
        if (event.getEventType() == KeyEvent.KEY_PRESSED) {
            if (event.getCode() == KeyCode.LEFT) {
                viewHandler.getViewJeu().moveBareLeft();
            } else if (event.getCode() == KeyCode.RIGHT) {
                viewHandler.getViewJeu().moveBareRight();
            } else if (event.getCode() == KeyCode.SPACE) {
                viewHandler.getViewJeu().moveBall();
            }
        }
    }




}
