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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public List<Spieler> getSpielers() {
        return spielers;
    }

    public void setSpielers(List<Spieler> spielers) {
        this.spielers = spielers;
    }

    @Override
    public String toString() {
        return "Character{id=" + id + ", name='" + name + "', Stadt='" + stadt + "', spielers=" + spielers + '}';
    }
}
