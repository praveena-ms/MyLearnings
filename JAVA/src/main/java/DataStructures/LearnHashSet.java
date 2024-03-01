package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        //Hashset, treeset, linked hashset
        //No duplicate elements in any set
        Set<Integer> set = new HashSet<>(); //No order. All operations in O(1)
        Set<Integer> set1 = new LinkedHashSet<>(); // It retains the order of the elements
        Set<Integer> set2 = new TreeSet<>(); //Set in a sorted order .. All operations in log(n) as this is implemented by binary tree

        //Custom class set
        Set<LearnStack> cs = new HashSet<>(); // do it with a student
        // set.add(new LearnStack("x", 3))

        set.add(23); // Generated hash of each element will be unique.
        set.add(21);
        set.add(34);
        set.add(25);

        System.out.println(set);
        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(30));

        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
