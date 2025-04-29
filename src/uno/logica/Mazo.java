package uno.logica;

import java.util.*;

public class Mazo {
    private final List<Carta> cartes;

    public Mazo() {
        cartes = new ArrayList<>();
        crearMazo();
    }

    private void crearMazo() {
        // Creem un mazo complet de cartes, amb 4 colors i 0-9
        for (Carta.Color color : Carta.Color.values()) {
            for (int i = 0; i <= 9; i++) {
                cartes.add(new Carta(i, color));
            }
        }
        barrejar();
    }

    public void barrejar() {
        Collections.shuffle(cartes); // Barreja les cartes
    }

    public Carta treureCarta() {
        if (cartes.isEmpty()) {
            return null; // Si no hi ha més cartes
        }
        return cartes.removeFirst(); // Retorna la primera carta del mazo
    }

}
