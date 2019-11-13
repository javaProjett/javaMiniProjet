package Model;


import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class Jeu {

    private int vies;
    private int score;
    private int niveauEnCours;


    private final Niveau[] niveau = {
            new Niveau(100, 0),
            new Niveau(12, 1),
            new Niveau(12, 2),
            new Niveau(12, 3),
            new Niveau(12, 4),
            new Niveau(12, 5)
    };

    public Jeu() {
        this.vies = 3;
        niveauEnCours = 0;
    }

    public void ajouterVies() {
        vies++;
    }

    public void supprimerVies() {
        vies--;
    }

    public int getVies() {
        return vies;
    }

    public void updateScore(int score) {
        this.score += score;
    }

    public Niveau niveauSuivant() {
        return niveau[++niveauEnCours];
    }

    public Niveau niveauEnCours() {
        return niveau[niveauEnCours];
    }

    public void majScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public Niveau[] getNiveau() {
        return niveau;
    }

    public void setNiveauEnCours(int niveauEnCours) {
        this.niveauEnCours = niveauEnCours;
    }



}
