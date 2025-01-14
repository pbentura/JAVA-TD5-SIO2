package com.sio.javatd5sio2;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TodoListApplicationTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws IOException {
        TodoListApplication app = new TodoListApplication();
        app.start(stage);
    }

    // Add your tests here

    @Test
    void testScenarioAddTask() {
        // Add your test here
        TextField taskField = lookup("#txtTaskTitle").query();
        clickOn(taskField).write("Task 1");
        assertEquals("Task 1", taskField.getText());
        Button addButton = lookup("#addBtn").queryButton();
        clickOn(addButton);

        ListView listView = lookup("#lvTasks").query();
        assertEquals(1, listView.getItems().size());
        //assertEquals("Task 1", listView.getItems().getFirst());

    }

    @Test
    void testScenarioAddTaskWithEmptyTitle(){
        Button addButton = lookup("#addBtn").queryButton();
        clickOn(addButton);
        assertTrue(lookup("Le titre ne peut pas être vide").tryQuery().isPresent());
    }
}
