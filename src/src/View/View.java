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

    public void manageSpielers(Scanner scanner) {
        System.out.println("\nManage Products");
        System.out.println("1. Add Spieler");
        System.out.println("2. Edit Spieler");
        System.out.println("3. Delete Spieler");
        System.out.println("4. View Spielers");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> addSpieler(scanner);
            case 2 -> updateSpieler(scanner);
            case 3 -> deleteSpieler(scanner);
            case 4 -> viewSpielers();
            default -> System.out.println("Invalid choice.");
        }
    }

    private void addSpieler(Scanner scanner) {
        System.out.print("Enter Spieler Name: ");
        String name = scanner.next();
        System.out.print("Enter Age: ");
        double age = scanner.nextDouble();
        System.out.print("Enter Position: ");
        String position = scanner.next();
        System.out.print("Enter Marktwert: ");
        double marktwert = scanner.nextDouble();
        service.addSpieler(new Spieler(name, age, position, marktwert));
        System.out.println("Spieler added successfully.");
    }

    private void updateSpieler(Scanner scanner) {
        System.out.print("Enter Spieler Name to Edit: ");
        String name = scanner.next();
        System.out.print("Enter New Age: ");
        double  age = scanner.nextDouble();
        System.out.print("Enter New Position: ");
        String position = scanner.next();
        System.out.print("Enter New Marktwert: ");
        double marktwert = scanner.nextDouble();
        if (service.updateSpieler(name, age, position, marktwert)) {
            System.out.println("Spieler updated successfully.");
        } else {
            System.out.println("Spieler not found.");
        }
    }

    private void deleteSpieler(Scanner scanner) {
        System.out.print("Enter Spieler Name to Delete: ");
        String name = scanner.next();
        if (service.deleteSpieler(name)) {
            System.out.println("Spieler deleted successfully.");
        } else {
            System.out.println("Spieler not found.");
        }
    }

    private void viewSpielers() {
        List<Spielers> spielers = service.getSpielers();
        if (spielers.isEmpty()) {
            System.out.println("No spielers available.");
        } else {
            spielers.forEach(System.out::println);
        }
    }

    public void filterVereinesByStadt(Scanner scanner) {
        System.out.print("Enter Stadt to filter Vereines: ");
        String stadt = scanner.next();
        List<Vereines> filteredVereines = service.filterVereinesByStadt(stadt);

        if (filteredVereines.isEmpty()) {
            System.out.println("No Vereines found in this stadt.");
        } else {
            System.out.println("Vereines from stadt \"" + stadt + "\":");
            filteredVereines.forEach(System.out::println);
        }
    }
}