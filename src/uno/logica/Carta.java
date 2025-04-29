package uno.logica;


public record Carta(int numero, uno.logica.Carta.Color color) {
    public enum Color {
        GROC, VERMELL, BLAU, VERD, Groc, Vermell, Blau, Verd
    }

}