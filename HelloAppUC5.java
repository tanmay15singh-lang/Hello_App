/**
 * HelloAppUC5.java – Demonstrates the use of enhanced for loop
 * to process command-line arguments.
 *
 * UC5: Accept zero or more command-line arguments and print greetings.
 * If no arguments are provided, print "Hello, World!".
 *
 * @author Tanmay
 * @version 1.0
 * @since UC5
 */

public class HelloAppUC5 {

    public static void main(String[] args) {

        // If no names are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            // Enhanced for loop
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }

        }

    }
}