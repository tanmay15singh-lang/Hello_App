/**
 * HelloAppUC6.java – Demonstrates enhanced for loop and substring method
 * to format output without trailing delimiter.
 *
 * UC6: Accept multiple names, join them with commas,
 * and remove trailing comma using substring().
 *
 * @author Tanmay
 * @version 1.0
 * @since UC6
 */

public class HelloAppUC6 {

    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            String result = "";

            // Build string with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", "
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello, " + result + "!");
        }

    }
}