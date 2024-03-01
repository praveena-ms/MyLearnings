package DataStructures;

import java.util.ArrayList;
import java.util.List;


public class Student implements Comparable<Student>{
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();

        student.add("Praveena");
        student.add("Veena");
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
