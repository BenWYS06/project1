package todoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager(); // class này bạn sẽ code để làm việc với DB

        while (true) {
            System.out.println("\n===== TODO LIST MENU =====");
            System.out.println("1. Add task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Update task");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự xuống dòng

            switch (choice) {
                case 1:
                String title=sc.nextLine();
                String description=sc.nextLine();
                String deadline=sc.nextLine();   // hoặc LocalDate
                String priority=sc.nextLine();// Low, Medium, High
                taskManager.addTask(new Task(title, description, deadline, priority, false));
                    break;
                case 2:
                taskManager.showAllTasks();
                    // TODO: gọi taskManager.getAllTasks()
                    break;
                case 3:
                
                    // TODO: gọi taskManager.updateTask()
                    break;
                case 4:
                    // TODO: gọi taskManager.deleteTask()
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

