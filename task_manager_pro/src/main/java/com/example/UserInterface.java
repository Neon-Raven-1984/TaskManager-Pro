package com.example;

import java.util.Scanner;

public class UserInterface {
    private TaskManager manager;
    private Scanner sc;

    public UserInterface(TaskManager manager) {
        this.manager = manager;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    manager.addTask(title, desc);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task index: ");
                    int index = sc.nextInt();
                    manager.completeTask(index - 1);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
