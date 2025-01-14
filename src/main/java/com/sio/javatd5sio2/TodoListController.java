package com.sio.javatd5sio2;

import com.sio.javatd5sio2.models.Task;
import com.sio.javatd5sio2.services.TaskManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TodoListController implements Initializable {

    @FXML
    private TextField txtTaskTitle;

    @FXML
    private ListView<Task> lvTasks;

    private ObservableList<Task> observableTasks ;

    private TaskManager taskManager;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.taskManager = new TaskManager();
        this.observableTasks = FXCollections.observableArrayList(this.taskManager.getTasks());
        this.lvTasks.setItems(this.observableTasks);
    }

    @FXML
    public void onBtnAddClick() {
        String title = txtTaskTitle.getText();

        if(title.isBlank()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Le titre ne peut pas être vide");
            alert.showAndWait();
            return;
        }
        Task task = new Task(title);
        this.taskManager.addTask(task);
        this.observableTasks.add(task);

        txtTaskTitle.clear();

    }

    @FXML
    public void onBtnUpdateClick() {
        Task task = lvTasks.getSelectionModel().getSelectedItem();

        if(task == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez sélectionner une tâche");
            alert.showAndWait();
            return;
        }

        task.updateCompletion();
        this.lvTasks.refresh();
    }

    @FXML
    public void onBtnRemoveClick() {
        Task task = lvTasks.getSelectionModel().getSelectedItem();

        if(task == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Veuillez sélectionner une tâche");
            alert.showAndWait();
            return;
        }

        this.taskManager.removeTask(task);
        this.observableTasks.remove(task);

    }


}