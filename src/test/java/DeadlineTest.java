import org.junit.jupiter.api.Test;
import task.Deadline;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {
    @Test
    public void getTypeIcon_deadlineTask_hasCorrectTypeIcon() {
        String expected = "D";
        Deadline deadline = new Deadline("read book", LocalDate.of(2020, 1, 1));
        assertEquals(expected, deadline.getTypeIcon());
    }

    @Test
    public void testToString_deadlineTask_hasCorrectDescription() {
        String expected = "[D] [\u2718] read book (by: 2020-01-01)";
        Deadline deadline = new Deadline("read book", LocalDate.of(2020, 1, 1));
        assertEquals(expected, deadline.toString());
    }
}

