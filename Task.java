package project_todoList;

public class Task {
    private int id;
    private String title;
    private String description;
    private String deadline;   // hoặc LocalDate
    private String priority;   // Low, Medium, High
    private boolean completed;
    public Task( String title, String description, String deadline, String priority, boolean completed) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = completed;
    }
    // constructor

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    // getter & setter

    @Override
    public String toString() {
        return "[" + id +"]" + "-" + title + "-" + description + "-" + deadline + "-" + priority +"-" + completed  ;
    }
    // toString()
}

