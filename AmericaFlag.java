
public class AmericaFlag {
    public static void main(String[] args) {
        int rows = 8; // Total rows in the flag
        int starRows = 3; // Rows with stars
        int starColumns = 6; // Number of stars in a row
        int stripeLength = 14; // Length of the flag stripes

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < stripeLength; col++) {
                // Print stars and stripes for the upper part of the flag
                if (row < starRows && col < starColumns) {
                    System.out.print("*"); // Print stars
                } else if (row < starRows && col >= starColumns) {
                    System.out.print("="); // Print stripes next to stars
                } else {
                    // Print stripes for the lower part of the flag
                    System.out.print("=");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}

