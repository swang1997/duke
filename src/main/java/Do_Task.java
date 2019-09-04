public class Do_Task extends Task {

    protected String Status = "T"; //begin with this
    protected boolean isDone; //tick and cross


    public Do_Task(String date, String Status, String description) {
        super(date, Status, description);
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public boolean isDone(){
        return isDone;
    }

    @Override
    public String toString(){
        return "[" + Status + "]" + "[" + getStatusIcon() + "]" + description;
    }
}
