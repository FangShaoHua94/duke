package Task;

import java.time.LocalDateTime;

public class Task_Event extends Task{
    private LocalDateTime time;

    public Task_Event(String description, LocalDateTime time){
        super(description);
        this.time=time;
    }

    @Override
    public String getTypeIcon() {
        return "E";
    }

    @Override
    public String toString() {
        return super.toString()+" (at: "+time+")";
    }
}
