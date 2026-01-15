package ToDoApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application {
    private TaskService taskService = new TaskService();

    private ListView<Task> listView;
    private TextArea detailsArea;
    private Button toggleDoneButton;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Task Manager");

        // Input panel
        VBox inputPanel = createInputPanel();

        // List of tasks
        listView = new ListView<>(taskService.getTasks());

        // Graphic differences (task done and normal task, high priority)
        listView.setCellFactory(param -> new ListCell<Task>() {
            @Override
            protected void updateItem(Task item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setStyle("");
                } else {
                    String text = item.getTitle() + " (" + item.getPriority() + ")";

                    if (item.isDone()) {
                        setText("[DONE] " + text);
                        setTextFill(Color.GRAY);
                        setStyle("-fx-strikethrough: true;");
                    } else {
                        setText(text);
                        setTextFill(Color.BLACK);
                        if (item.getPriority() == Task.Priority.HIGH) {
                            setStyle("-fx-font-weight: bold;");
                        } else {
                            setStyle("");
                        }
                    }
                }
            }
        });

        listView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            showDetails(newVal);
        });

        // Details panel
        VBox detailsPanel = createDetailsPanel();

        BorderPane root = new BorderPane();
        root.setLeft(inputPanel);
        root.setCenter(listView);
        root.setRight(detailsPanel);
        BorderPane.setMargin(listView, new Insets(10));
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #167ed9");

        Scene scene = new Scene(root, 900, 500);

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.DELETE) {
                Task selected = listView.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    taskService.removeTask(selected);
                    showDetails(null);
                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox createInputPanel() {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10));
        box.setPrefWidth(250);
        box.setStyle("-fx-border-color: #000000; -fx-border-width: 1; -fx-background-color: #262978");

        Label header = new Label("New Task");
        header.setStyle("-fx-font-weight: bold; font-size: 14px;");
        header.setTextFill(Color.WHITE);

        TextField titleField = new TextField();
        titleField.setPromptText("Title (required)");

        TextArea descriptionArea = new TextArea();
        descriptionArea.setPromptText("Description");

        DatePicker datePicker = new DatePicker();
        datePicker.setMaxWidth(Double.MAX_VALUE);

        ComboBox<Task.Priority> priorityBox = new ComboBox<>();
        priorityBox.getItems().addAll(Task.Priority.values());
        priorityBox.setValue(Task.Priority.MEDIUM);
        priorityBox.setMaxWidth(Double.MAX_VALUE);

        Button addButton = new Button("Add task");
        addButton.setMaxWidth(Double.MAX_VALUE);

        addButton.setOnAction(e -> {
            String title = titleField.getText();

            if (title == null || title.trim().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Title cannot be empty");
                alert.showAndWait();
                return;
            }

            Task task = new Task(
                    title,
                    descriptionArea.getText(),
                    datePicker.getValue(),
                    priorityBox.getValue()
            );
            taskService.addTask(task);

            titleField.clear();
            descriptionArea.clear();
            datePicker.setValue(null);
        });

        Label titleLabel = new Label("Title:");
        titleLabel.setTextFill(Color.WHITE);
        Label descriptionLabel = new Label("Description:");
        descriptionLabel.setTextFill(Color.WHITE);
        Label deadlineLabel = new Label("Deadline:");
        deadlineLabel.setTextFill(Color.WHITE);
        Label priorityLabel = new Label("Priority:");
        priorityLabel.setTextFill(Color.WHITE);
        box.getChildren().addAll(header,
                titleLabel, titleField,
                descriptionLabel, descriptionArea,
                deadlineLabel, datePicker,
                priorityLabel, priorityBox, addButton);

        return box;
    }

    private VBox createDetailsPanel() {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10));
        box.setPrefWidth(250);
        box.setStyle("-fx-border-color: #000000; -fx-border-width: 1; -fx-background-color: #262978");

        Label header = new Label("Details");
        header.setStyle("-fx-font-weight: bold; font-size: 14px");
        header.setTextFill(Color.WHITE);

        detailsArea = new TextArea();
        detailsArea.setEditable(false);
        detailsArea.setWrapText(true);
        detailsArea.setPrefHeight(200);

        toggleDoneButton = new Button("Mark as done");
        toggleDoneButton.setMaxWidth(Double.MAX_VALUE);
        toggleDoneButton.setDisable(true);

        toggleDoneButton.setOnAction(e -> {
            Task selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                taskService.updateTaskStatus(selected);
                listView.refresh();
                showDetails(selected);
            }
        });

        box.getChildren().addAll(header, detailsArea, toggleDoneButton);
        return box;
    }

    private void showDetails(Task task) {
        if (task == null) {
            detailsArea.setText("");
            toggleDoneButton.setDisable(true);
            toggleDoneButton.setText("Mark as done");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Title: ").append(task.getTitle()).append("\n");
            sb.append("Priority: ").append(task.getPriority()).append("\n");
            sb.append("Deadline: ").append(task.getDeadline() != null ? task.getDeadline() : "-").append("\n");
            sb.append("Status: ").append(task.isDone() ? "DONE" : "TO DO").append("\n\n");
            sb.append("Description:\n").append(task.getDescription());

            detailsArea.setText(sb.toString());
            toggleDoneButton.setDisable(false);
            toggleDoneButton.setText(task.isDone() ? "Undo marking as done" : "Mark as done");
        }
    }
}
