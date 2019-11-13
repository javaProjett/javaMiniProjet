package Model;


import java.util.ArrayList;
import java.util.List;

public class Niveau {

    private List<Briques> briquesList;
    private int nombreBriques;
    private int velocity;


    Niveau(int nombreBriques, int niveau) {
        this.nombreBriques = nombreBriques ;

        int i;
        briquesList = new ArrayList<>();
        for (i = 0; i < nombreBriques; i++)
            briquesList.add(new Briques(Briques.laBrick, niveau >= 1, velocity));
    }

    public List<Briques> getBriquesList() {
        return briquesList;
    }


    public int getNombreBriques() {
        return nombreBriques;
    }

}
