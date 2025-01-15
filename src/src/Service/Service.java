package Service;

import Model.Spieler;
import Model.Vereine;

import java.util.*;
import java.util.stream.Collectors;

public class Service {
    private final List<Spieler> spielers = new ArrayList<>();
    private final List<Vereine> vereines = new ArrayList<>();

    public void addSpieler(Spieler spieler) {
        spielers.add(spieler);
    }

    public boolean updateSpieler(String name, double newAge, String newPosition, String newMarktwert) {
        return spielers.stream()
                .filter(spieler -> spieler.getName().equals(name))
                .findFirst()
                .map(spieler -> {
                    spieler.setAge(newAge);
                    spieler.setPosition(newPosition);
                    spieler.setMarktwert(newMarktwert);
                    return true;
                }).orElse(false);
    }

    public boolean deleteSpieler(String name) {
        return spieler.removeIf(spieler -> spieler.getName().equals(name));
    }

    public List<Spieler> getSpielers() {
        return new ArrayList<>(spielers);
    }

}
