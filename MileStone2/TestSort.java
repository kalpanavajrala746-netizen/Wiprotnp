package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task2.Dailytask;

public class TestSort {

    @Test
    public void testSortValues() {

        Dailytask obj = new Dailytask();

        int[] actual = obj.sortValues(new int[] {5,2,8,1,3});

        int[] expected = {1,2,3,5,8};

        assertArrayEquals(expected, actual);
    }
}