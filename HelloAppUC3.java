/**
 * HelloAppUC3.java – Demonstrates command-line argument with default value.
 *
 * UC 1: Display "Hello World"
 * UC 2: Display user name from command-line argument
 * UC 3: Display user name or default to "World" if no argument is provided
 *
 * @author Tanmay
 * @version 1.0
 * @since UC3
 */

public class HelloAppUC3 {

    public static void main(String[] args) {

        String name;

        // Check if user provided a name
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}