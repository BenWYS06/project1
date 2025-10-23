package project_todoList;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks=new ArrayList<>();
    private int nextId=1;
    
    public void addTask(Task task) {
           task.setId(nextId++);
           tasks.add(task);
     }
    public void removeTask(int id) {
           for(int i=0;i<tasks.size();i++){
              if(tasks.get(i).getId()==id){
                tasks.remove(i);
                return;
              } 
           }
           System.out.println("Task not found");
    }
    public void markAsCompleted(int id) {
           for(int i=0;i<tasks.size();i++){
              if(tasks.get(i).getId()==id){
                tasks.get(i).setCompleted(true);
              return;  
            }
           }
           System.out.println("Task not found");
     }
    public void showAllTasks() { 
           for(Task task:tasks){
             System.out.println(task.toString());
             if(task.isCompleted()){
                System.out.println(" - Done");
             }else{
                 System.out.println(" - Not Done");
             }
           }
    }
    public void searchTask(String keyword) {
        boolean check = true;
           for(Task task:tasks){
            if(task.getTitle().contains(keyword)||task.getDescription().contains(keyword)){
              System.out.println(task.toString());
              check=false;
            }
           }
           if(check) System.out.println("No Task Found");
     }
}

