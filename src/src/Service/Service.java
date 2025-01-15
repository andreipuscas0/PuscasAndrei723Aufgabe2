package Service;

import Model.Spieler;
import Model.Vereine;

import java.util.*;

public class Service {
    private final List<Spieler> spielers = new ArrayList<>();
    private final List<Vereine> vereines = new ArrayList<>();

    public void addSpieler(Spieler spieler) {
        spielers.add(spieler);
    }

    public boolean updateSpieler(String name, double newAge, String newPosition, double newMarktwert) {
        return spielers.stream()
                .filter(spieler -> spieler.getName().equals(name))
                .findFirst()
                .map(spieler -> {
                    spieler.setAge((int) newAge);
                    spieler.setPosition(newPosition);
                    spieler.setMarktwert((int) newMarktwert);
                    return true;
                }).orElse(false);
    }

    public boolean deleteSpieler(String name) {
        return spielers.removeIf(spieler -> spieler.getName().equals(name));
    }

    public List<Spieler> getSpielers() {
        return new ArrayList<>(spielers);
    }

    public void addVereine(Vereine vereine) {
        vereines.add(vereine);
    }

    public boolean updateVereine(int id, String newName, String newStadt, List<Spieler> newSpieler) {
        return vereines.stream()
                .filter(vereine -> vereine.getId() == id)
                .findFirst()
                .map(vereine -> {
                    vereine.setName(newName);
                    vereine.setStadt(newStadt);
                    vereine.setSpielers(newSpieler);
                    return true;
                }).orElse(false);
    }

    public boolean deleteCharacter(int id) {
        return vereines.removeIf(vereine -> vereine.getId() == id);
    }

    public List<Vereine> getVereines() {
        return new ArrayList<>(vereines);
    }


}
