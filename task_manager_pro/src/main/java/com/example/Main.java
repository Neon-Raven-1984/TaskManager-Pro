package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Task Manager!");
        
        TaskManager manager = new TaskManager();
        UserInterface ui = new UserInterface(manager);
        ui.start();
    }
}
