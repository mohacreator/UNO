package uno.logica;

import java.util.*;

public class Pilo {
    private final List<Carta> cartes;

    public Pilo() {
        cartes = new ArrayList<>();
    }

    public void afegirCarta(Carta carta) {
        cartes.add(carta);
    }

    public Carta veureUltimaCarta() {
        if (cartes.isEmpty()) {
            return null;
        }
        return cartes.getLast(); // Retorna l'última carta jugada
    }
}
