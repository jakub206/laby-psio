package ex5;

import ex5.TaskService;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUI {
    private final TaskService taskService;
    private final Scanner scanner;

    public ConsoleUI(TaskService taskService) {
        this.taskService = taskService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = getChoice();
            System.out.println();
            processChoice(choice);
            System.out.println();
        }
    }

    private void displayMenu() {
        System.out.println("---------- Menu ----------");
        System.out.println("1. View tasks");
        System.out.println("2. Add task");
        System.out.println("3. Mark task as done");
        System.out.println("4. Save and exit");
        System.out.println("--------------------------");
        System.out.print("Your choice: ");
    }

    private int getChoice() {
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please type a number 1-4");
            scanner.nextLine();
            return -1;
        }
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                taskService.displayTasks();
                break;

            case 2:
                handleAddTask();
                break;

            case 3:
                handleMarkDone();
                break;

            case 4:
                taskService.exit();
                break;

            default:
                if (choice != -1) {
                    System.out.println("Invalid option! Try again");
                }
                break;
        }
    }

    private void handleAddTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        LocalDate dueDate = null;
        while (dueDate == null) {
            System.out.print("Enter due date (YYYY-MM-DD): ");
            String dateInput = scanner.nextLine();
            try {
                dueDate = LocalDate.parse(dateInput);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! Please try again");
            }
        }

        taskService.addTask(title, description, dueDate);
    }

    private void handleMarkDone() {
        System.out.print("Enter task id: ");

        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            taskService.setTaskAsDone(id);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! ID must be a number!");
            scanner.nextLine();
        }
    }
}

