package ex4;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                .create();

        tasks.add(new Task("Lista na laby psio", "Wykonaj listę na laby z psio", true, LocalDate.of(2025,12,15)));
        tasks.add(new Task("Zadanie OSK","Wykonaj zadania z listy na OSK", false,  LocalDate.of(2025,12,15)));
        tasks.add(new Task("Nauka Numpy", "Przerobić wszystkie tutoriale z numpy", false,  LocalDate.of(2025,12,31)));

        //Serializacja do pliku tasks_lib.json
        File serializationFile = new File("data/tasks_lib.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(serializationFile));
            gson.toJson(tasks, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Deserializacja z pliku do listy
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/tasks_lib.txt"));
            Type taskListType = new TypeToken<ArrayList<Task>>(){}.getType();
            ArrayList<Task> tasks2 = gson.fromJson(reader,  taskListType);
            reader.close();

            for(Task task : tasks2){
                System.out.println(task);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
