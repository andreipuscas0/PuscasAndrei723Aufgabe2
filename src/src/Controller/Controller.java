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


}
