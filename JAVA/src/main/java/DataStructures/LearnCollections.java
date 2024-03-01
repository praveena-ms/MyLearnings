package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {
        //Some more additional functionalities than collection interface
        //Min, max, frequency of element etc..

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(4);

        System.out.println("min " + Collections.min(list));
        System.out.println("max " + Collections.max(list));
        System.out.println(Collections.frequency(list, 5));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
    }
}
