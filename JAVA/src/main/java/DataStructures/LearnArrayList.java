package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Praveena");
        students.add("Veena");
        System.out.println(students);
        students.add(1, "AAAAA"); // Adds at a specific index
        System.out.println(students); //toString method will be invoked whenever we are trying to access these
        System.out.println(students.get(2));
        students.remove(String.valueOf("AAAAA")); // can be an index or an element of that type / object
        System.out.println(students);
        System.out.println(students.contains("Veena"));

        //Iteration
        for(String s: students) {
            System.out.println("Hello " + s);
        }


        //Iterator. We can iterator in any of the collections
        Iterator<String> it = students.iterator();
        while (it.hasNext())
            System.out.println("Hi " + it.next());
    }
}
