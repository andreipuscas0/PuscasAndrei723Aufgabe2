package Controller;

import Service.Service;
import View.View;

import java.util.Scanner;

public class Controller {
    private final Service service;
    private final View view;

    public Controller() {
        this.service = new Service();
        this.view = new View(service);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            view.displayMainMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> view.manageSpielers(scanner);
//                case 2 -> view.manageVereines(scanner);
                case 3 -> view.filterVereinesByStadt(scanner);
                case 4 -> view.findSpielersByName(scanner);
//                case 5 -> view.sort(scanner);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
}
