package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

public class LearnStrings {
    public static void main(String[] args) {
        System.out.println(56); // Calls to string method
        //Primitives are stored in stack memory and objects in heap memory and we can do a lot of operations using Integer
        System.out.println("Praveena"); // to string method
        System.out.println(new int[]{1,2,3,4}); // converts to string using the inbuilt toString method.
        System.out.println(Arrays.toString(new int[]{1,2,4,5})); // Use the toString method in Arrays
        //By overriding the inbuilt toString method that will be called by default.

        String name = null;
        System.out.println(name);

        //Allowing to modify the same string
        StringBuilder builder = new StringBuilder();

        String series = "";
        for(int i=0; i< 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series = series + ch; // if one of the datatype is string, answer will be string
            builder.append(ch);
        }
        System.out.println(series);
        System.out.println(builder.toString()); //prints same result but it reduces the complexity
        System.out.println(builder.reverse());

        float a = 435.1245f;
        System.out.printf("%.2f", a); // rounding off
        System.out.printf("name is %s and role is %s ", "Praveena", "QA");
        // These are called placeholders

        //Operator overloading, it provides more operations. '+' is supported to work on Strings
        // C++ or python allows to override operators and define your own. But java doesn't allow
        System.out.println('a' + 'b'); // for chars, it takes the ASCII values and adds them
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3)); // Prints d: by considering the ASCII of the character
        System.out.println("a" + 1); // converst the integer to toString() and prints a1

        System.out.println("Praveena" + new ArrayList<>()); // Praveena[]  : returns an empty array
        // If there is an object, it convers to toString()

        String username = "Praveena M";
        System.out.println(Arrays.toString(username.toCharArray()));
        System.out.println(username.toLowerCase());
        System.out.println(username.concat(" Muvva"));
        System.out.println(username.indexOf('a'));
        System.out.println(username.lastIndexOf('a'));
        System.out.println(username.trim());
        System.out.println(Arrays.toString(username.split(" ")));
    }
}
