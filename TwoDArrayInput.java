
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10]; // Declare a 2D array of size 10x10

        // Assign elements to the 2D array using nested loops
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt(); // Accept input from the user
            }
        }

        // Print out the input entered by the user using a for-each loop
        System.out.println("You entered:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}

