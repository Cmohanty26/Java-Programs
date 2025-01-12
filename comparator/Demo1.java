package com.comparator;

import java.util.Arrays;
import java.util.Comparator;



public class Demo1 {
    public static void main(String[] args) {
        String[] arr = { "mango", "banana", "guavaa", "strawberry" };

        // Sorting the array based on length using the custom comparator
        Arrays.sort(arr, new LenCom1());

        // Printing the sorted array
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
