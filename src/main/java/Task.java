

public class Task {
    protected String description; // words
    protected String date; //date
    protected String Status; //[D] etc
    protected boolean isDone; //tick and cross

    public String description() {
        return description;
    }

    public String date() {
        return date;
    }

    public String Status() {
        return Status;
    }

    public boolean isDone(){
        return isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public Task(String date, String Status, String description ) {
        this.date = date;
        this.Status = Status;
        this.description = description;
        this.isDone = false;
    }

    public void markasdone() {
        this.isDone = true;
    }

    public void markdescription(String description) {
        this.description = description;
    }

    public String print_result () {
        String combined = getStatusIcon() + description;
        System.out.println(combined);
        return combined;
    }
}