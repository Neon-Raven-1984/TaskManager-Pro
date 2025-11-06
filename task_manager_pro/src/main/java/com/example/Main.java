package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConsoleColor.GREEN + "Welcome to Task Manager!" + ConsoleColor.RESET);
        
        TaskManager manager = new TaskManager();
        UserInterface ui = new UserInterface(manager);
        ui.start();
    }
}
