package task;

import java.io.Serializable;

public abstract class Task implements Serializable {

    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public abstract String getTypeIcon();

    public void setDone(){
        isDone=true;
    }

    @Override
    public String toString() {
        return "["+getTypeIcon()+"] ["+getStatusIcon()+"] "+description;
    }
}