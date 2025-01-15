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




}
