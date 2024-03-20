package DataStructures;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        //binary search can be done directly with inbuilt method binarySearch
        int[] numbers = {3, 2, 7, 5, 3, 4, 9};
        int[] values = {55, 66, 77, 88};

        Arrays.binarySearch(numbers, 5); // returns the index. Can also provide from and to index params
        Arrays.compare(numbers, values); // returns 0 or 1

        Arrays.sort(numbers);

        for(int i=0; i<numbers.length; i++)
            System.out.println(numbers[i]);
        Arrays.fill(numbers, 12);

        Arrays.asList(numbers); // coverts array to list
        // toList doesn't work on char arrays
        // Stringbuilder reverse methods, SB to array method
        //8192 limit crossed - parallel sort
    }
}
