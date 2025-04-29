package uno;
import uno.interficie.*;
import uno.logica.Carta;
import uno.logica.Jugador;
import uno.logica.Mazo;
import uno.logica.Pilo;

public class Main {
    public static void main(String[] args) {
        // Creem un mazo i un pilo
        Mazo mazo = new Mazo();
        Pilo pilo = new Pilo();

        // Creem dos jugadors
        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");

        // Els jugadors roben cartes del mazo
        j1.addCarta(mazo.treureCarta());
        j1.addCarta(mazo.treureCarta());
        j2.addCarta(mazo.treureCarta());
        j2.addCarta(mazo.treureCarta());

        // Mostrem les cartes de cada jugador
        System.out.println("Cartes de " + j1.getNom());
        UI.mostrarCartes(j1.getCartes());
        System.out.println("Cartes de " + j2.getNom());
        UI.mostrarCartes(j2.getCartes());

        // El primer jugador juga una carta
        Carta cartaJugada = j1.getCartes().removeFirst();
        pilo.afegirCarta(cartaJugada);
        System.out.println("\nCarta jugada per " + j1.getNom() + ":");
        UI.mostrarCarta(cartaJugada);

        // El segon jugador juga una carta
        cartaJugada = j2.getCartes().removeFirst();
        pilo.afegirCarta(cartaJugada);
        System.out.println("\nCarta jugada per " + j2.getNom() + ":");
        UI.mostrarCarta(cartaJugada);

        // Mostrem l'última carta jugada a la pila
        System.out.println("\nÚltima carta jugada a la pila:");
        UI.mostrarCarta(pilo.veureUltimaCarta());
    }
}