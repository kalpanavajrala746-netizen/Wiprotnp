package com.wipro.task2;

import java.util.Arrays;

public class Dailytask2 {

    public int[] sortValues(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public boolean checkPresence(int[] arr,int value) {

        Arrays.sort(arr);

        for(int i : arr) {

            if(i==value)
                return true;
        }

        return false;
    }
}