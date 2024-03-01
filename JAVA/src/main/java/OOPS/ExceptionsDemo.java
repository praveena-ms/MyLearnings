package OOPS;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    //Types of exceptions:
    // Checked: Get checked at compile time. Anticipate and handle properly. Terminate the prog and display a friendly msg.
    // Unchecked / runtime: eg: null pointer exc, arithmetic, illegal argument, index out of bounds, illegal state
    // Error: programming errors like infinite loop or JVM issue.
    public static void show() {
       // var reader = new FileReader("s.txt");
        FileReader reader = null;
        try {
            new SimpleDateFormat().parse("");
            reader = new FileReader("file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

    public static void main(String[] args) {

    }
}
