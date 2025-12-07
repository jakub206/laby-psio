package ex4;

public class Ticket {
    private int id;
    private String title;
    private String user;
    private int priority;
    private boolean resolved;

    public Ticket(int id, String title, String user, int priority) {
        this.id = id;
        this.title = title;
        this.user = user;
        this.priority = priority;
        this.resolved = false;
    }

    public String toString(){
        return "id: "+id+", title: "+title+", user: "+user+", priority: "+priority+", resolved: "+resolved;
    }

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}