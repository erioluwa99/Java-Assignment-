public class Flag {
    public static void main(String[] args) {
        // Dimensions of the flag
        int height = 4; // Number of rows
        int widthPerColor = 6; // Width of each color block

        // Loop to print the flag
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < widthPerColor * 3; col++) {
                if (col < widthPerColor) {
                    System.out.print("*"); // Green block
                } else if (col < widthPerColor * 2) {
                    System.out.print("="); // White block
                } else {
                    System.out.print("*"); // Green block
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
