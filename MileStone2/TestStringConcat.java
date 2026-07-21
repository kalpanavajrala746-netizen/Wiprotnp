package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.tasks.DailyTask;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTask obj = new DailyTask();

        String actual = obj.doStringConcat("Hello", "World");
        String expected = "Hello World";

        assertEquals(expected, actual);
    }
}