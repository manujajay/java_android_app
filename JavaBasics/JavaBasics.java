// This is a comment. Comments are not executed by the computer.

// We need to import some libraries for using ArrayList
import java.util.ArrayList;

// Define a class. Everything in Java is inside a class.
public class JavaBasics {

    // Class variable (also known as a static variable)
    static String classVar = "This is a class (static) variable";

    // Instance variable
    String instanceVar = "This is an instance variable";

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Local variable
        int myNumber = 5;

        // Displaying variables
        System.out.println("Local variable: " + myNumber);
        System.out.println("Class variable: " + classVar);

        // Control Structures
        if (myNumber > 3) {
            System.out.println("The number is greater than 3");
        } else {
            System.out.println("The number is 3 or less");
        }

        // Loops
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Using methods
        greet("Alice");

        // Create an object (an instance of the JavaBasics class)
        JavaBasics object = new JavaBasics();
        System.out.println("Instance variable: " + object.instanceVar);

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First number in the array: " + numbers[0]);

        // ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        System.out.println("First name in the list: " + names.get(0));
    }

    // Define a static method
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
