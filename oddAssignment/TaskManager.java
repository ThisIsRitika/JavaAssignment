import java.util.*;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TaskManager {
    static List<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int idCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Update Task\n4. Delete Task\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Important: clear newline

            switch (choice) {
                case 1: addTask(); break;
                case 2: viewTasks(); break;
                case 3: updateTask(); break;
                case 4: deleteTask(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void addTask() {
        System.out.print("Enter task name: ");
        String name = sc.nextLine();
        tasks.add(new Task(idCounter++, name));
        System.out.println("Task added.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        }
        for (Task t : tasks) {
            System.out.println(t.id + ": " + t.name);
        }
    }

    static void updateTask() {
        System.out.print("Enter task ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Task t : tasks) {
            if (t.id == id) {
                System.out.print("Enter new task name: ");
                t.name = sc.nextLine();
                System.out.println("Task updated.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        Iterator<Task> itr = tasks.iterator();
        while (itr.hasNext()) {
            if (itr.next().id == id) {
                itr.remove();
                System.out.println("Task deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}