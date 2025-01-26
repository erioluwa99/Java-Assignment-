
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10]; // Declare an array of length 10

        // Assign elements to the array using a loop
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt(); // Accept input from the user
        }

        // Print out the input entered by the user using a for-each loop
        System.out.println("You entered:");
        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}

