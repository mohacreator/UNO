package uno.logica;

import java.util.ArrayList;

public class Jugador {
    private final String nom;
    private final ArrayList<Carta> cartes;

    public Jugador(String nom) {
        this.nom = nom;
        this.cartes = new ArrayList<>();
    }

    public void addCarta(Carta carta) {
        cartes.add(carta);
    }

    public ArrayList<Carta> getCartes() {
        return cartes;
    }

    public String getNom() {
        return nom;
    }
}
