/**
 * HelloAppUC4.java – Demonstrates handling multiple command-line arguments.
 *
 * UC1: Display "Hello World"
 * UC2: Display user name from command-line argument
 * UC3: Display user name or default to "World"
 * UC4: Display greetings for multiple names
 *
 * @author Tanmay
 * @version 1.0
 * @since UC4
 */

public class HelloAppUC4 {

    public static void main(String[] args) {

        // If no names provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Loop through all arguments
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }

        }

    }
}