package com.sio.javatd5sio2.services;

import com.sio.javatd5sio2.models.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    private TaskManager manager;

    @BeforeEach
    void setUp() {
        manager = new TaskManager();
    }

    @Test
    void testAddTask() {
        Task task = new Task("Task 1");
        manager.addTask(task);
        assertEquals(1, manager.getTasks().size());
        assertTrue(manager.getTasks().contains(task));
    }

    @Test
    void testRemoveTask() {
        Task task = new Task("Task 1");
        manager.addTask(task);
        manager.removeTask(task);
        assertTrue(manager.getTasks().isEmpty());
    }

    @Test
    void testGetTasks() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        manager.addTask(task1);
        manager.addTask(task2);
        List<Task> tasks = manager.getTasks();
        assertEquals(2, tasks.size());
    }



}