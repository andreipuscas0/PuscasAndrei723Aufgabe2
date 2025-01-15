package View;

import Model.Spieler;
import Model.Vereine;
import Service.Service;

import java.util.List;
import java.util.Scanner;

public class View {
    private final Service service;

    public View(Service service) {
        this.service = service;
    }

    public void displayMainMenu() {
        System.out.println("\nFußballvereinmanagement\n");
        System.out.println("1. Manage Spielers");
        System.out.println("2. Manage Vereines");
        System.out.println("3. Filter Vereines by Stadt");
        System.out.println("4. Find Spielers by Name von Benutzer");
        System.out.println("5. Sort Spielers by Marktwert");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

}