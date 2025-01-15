package Model;

import java.util.List;

public class Vereine {
    private int id;
    private String name;
    private String stadt;
    private List<Spieler> spielers;

    public Vereine(int id, String name, String stadt, List<Spieler> spielers) {
        this.id = id;
        this.name = name;
        this.stadt = stadt;
        this.spielers = spielers;
    }
}
