package com.sio.javatd5sio2.models;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void updateCompletion() {
        this.completed = !this.completed;
    }

    @Override
    public String toString() {
        return this.completed ? "(Completed) "+this.title : this.title;
    }
}
