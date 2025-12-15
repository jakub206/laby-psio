package ex5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskRepository {
    private final Gson gson;
    private ArrayList<Task> tasks;
    private File tasksFile = new File("data/tasks.json");;

    public TaskRepository() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                .create();
        this.tasks = loadTasks();
    }

    private ArrayList<Task> loadTasks() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(tasksFile));
            Type taskListType = new TypeToken<ArrayList<Task>>() {}.getType();
            ArrayList<Task> loadedTasks = gson.fromJson(reader, taskListType);

            System.out.println("Tasks loaded successfully");

            reader.close();

            return loadedTasks;
        } catch(FileNotFoundException e){
            System.out.println("File not found. List of tasks is empty");
            return new ArrayList<>();
        } catch(IOException e){
            System.err.println("Error reading file. List of tasks is empty");
            return new ArrayList<>();
        }
    }

    public void saveTasks() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(tasksFile));
            gson.toJson(tasks, writer);

            System.out.println("Tasks saved successfully");

            writer.close();
        } catch(Exception e) {
            System.err.println("Error writing file!");
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
