package ToDoApp;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TaskRepository {
    private Gson gson;
    private String filePath = "data/tasks.json";

    public TaskRepository() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                .create();
    }

    public List<Task> loadTasks() {
        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            Type listType = new TypeToken<ArrayList<Task>>(){}.getType();
            List<Task> tasks = gson.fromJson(reader, listType);
            reader.close();

            return tasks;

        } catch(FileNotFoundException e) {
            System.out.println("File not found. List of tasks is empty");
            return new ArrayList<>();
        } catch(IOException e){
            System.err.println("Error reading file. List of tasks is empty");
            return new ArrayList<>();
        }
    }

    public void saveTasks(List<Task> tasks) {
        try {
            File file = new File(filePath);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            gson.toJson(tasks, writer);
            writer.close();
        } catch (Exception e){
            System.out.println("Error saving tasks");
        }
    }
}
