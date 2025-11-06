package com.example;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
            System.out.println("Task marked as done!");
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
