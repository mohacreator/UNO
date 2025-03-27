class Jugador {
    private String nom;
    private List<Carta> cartes;

    public Jugador(String nom) {
        this.nom = nom;
        this.cartes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Carta> getCartes() {
        return cartes;
    }

    public void addCarta(Carta carta) {
        cartes.add(carta);
    }
}
