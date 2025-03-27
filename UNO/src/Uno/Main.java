package Uno;

public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta(1, Color.GROC);
        Carta c2 = new Carta(3, Color.VERMELL);
        Carta c3 = new Carta(6, Color.BLAU);
        Carta c4 = new Carta(9, Color.VERD);

        Jugador j1 = new Jugador("Jugador 1");
        j1.addCarta(c1);
        j1.addCarta(c2);
        j1.addCarta(c3);
        j1.addCarta(c4);

        for (Carta c : j1.getCartes()) {
            UI.mostrarCarta(c);
        }

        UI.mostrarCartes(j1.getCartes());
    }
}