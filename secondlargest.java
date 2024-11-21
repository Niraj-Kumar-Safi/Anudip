
//Write a program to find the second largest number in a given integer array.

import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        int c=0;
        int[] array = {12, 35, 1, 10, 34, 1};

        Arrays.sort(array); //sorting of elements in array
        c=array.length; // finding the length of array

        System.out.println("Second largest number :" +array[c-2]); //displaying second largest number in array 
    }
}
        

