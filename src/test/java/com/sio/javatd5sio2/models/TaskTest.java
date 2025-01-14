package com.sio.javatd5sio2.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;

    @BeforeEach
    void setUp() {
       task = new Task("Learn Java");
    }

    @Test
    void testTaskInitialization() {
        Task newTask = new Task("New task");
        assertEquals("New task", newTask.getTitle());
        assertFalse(newTask.isCompleted());
    }

    @Test
    void updateCompletion() {
        task.updateCompletion();
        assertTrue(task.isCompleted());
    }

    @Test
    void testToString() {
        assertEquals("Learn Java", task.toString());
        task.updateCompletion();
        assertEquals("(Completed) Learn Java", task.toString());
    }


}