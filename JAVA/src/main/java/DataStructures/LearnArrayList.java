package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Praveena");
        students.add("Veena");
        students.add(1, "AAAAA"); // Adds at a specific index
        //students.addAll(Comparator); // need to use comparator

        students.get(2);
        students.indexOf("e"); //returns the first occurance of the element
        students.lastIndexOf("e"); // returns the last occurance of the element
        students.subList(2, 4); // returns the list between from and to index positions
        students.set(0, "BBBB"); // modify element at any specific index

        students.remove(String.valueOf("AAAAA")); // can be an index or an element of that type / object
        students.remove(0); // removes element at an index

        students.isEmpty(); // returns true or false
        students.size(); // Returns the size of the arraylist
        students.contains("Veena"); // returns true or false

        //Iteration
        for(String s: students) {
            System.out.println("Hello " + s);
        }

        // Iterator. We can iterator in any of the collections
        Iterator<String> it = students.iterator();
        while (it.hasNext())
            System.out.println("Hi " + it.next());

        //Sorting
        Collections.sort(students); // pass comparator if required

        students.toArray(); // converting to array
        students.clear(); // removes all the elements
    }
}
