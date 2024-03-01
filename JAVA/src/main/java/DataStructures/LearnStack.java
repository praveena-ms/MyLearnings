package DataStructures;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        //LIFO
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");

        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals);
    }
}
