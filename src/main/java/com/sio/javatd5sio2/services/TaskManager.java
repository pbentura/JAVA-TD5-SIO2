package com.sio.javatd5sio2.services;

import com.sio.javatd5sio2.models.Task;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("La tâche " + task.getTitle() + " a été ajoutée");
        System.out.println("Il y a " + this.tasks.size() + " tâches");
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
        System.out.println("La tâche " + task.getTitle() + " a été supprimée");
        System.out.println("Il y a " + this.tasks.size() + " tâches");
    }

    public ArrayList<Task> getTasks() {
        System.out.println("Il y a " + this.tasks.size() + " tâches");
        return this.tasks;
    }
}
