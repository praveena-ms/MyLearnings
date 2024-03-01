package DataStructures;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        //binary search can be done directly with inbuilt method binarySearch
        Integer[] numbers = {3, 2, 7, 5, 3, 4, 9};
        Arrays.sort(numbers);

        for(int i=0; i<numbers.length; i++)
            System.out.println(numbers[i]);
        Arrays.fill(numbers, 12);

        // toList doesn't work on char arrays
        // Stringbuilder reverse methods, SB to array method
        //8192 limit crossed - parallel sort
    }
}
