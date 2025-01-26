package statistics;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        // Example array
        int[] data = {2,5,5,9,4,7,0,9,6,11,12};
        
        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int length = array.length;
        if (length % 2 == 0) {
            // If even, median is the average of the two middle numbers
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            // If odd, median is the middle number
            return array[length / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}

