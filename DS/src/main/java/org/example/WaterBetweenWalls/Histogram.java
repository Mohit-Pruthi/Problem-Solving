package org.example.WaterBetweenWalls;

public class Histogram {
    public static void main(String[] args) {
        //int[] array = {3, 5, 2, 7, 4};
        int[] array = {1, 5, 4, 3};
        drawHistogram(array);
    }

    public static void drawHistogram(int[] array) {
        int maxMagnitude = findMaxMagnitude(array);

        // Draw histogram
        for (int i = maxMagnitude; i > 0; i--) {
            for (int num : array) {
                if (num >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print x-axis labels
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static int findMaxMagnitude(int[] array) {
        int maxMagnitude = 0;
        for (int num : array) {
            if (num > maxMagnitude) {
                maxMagnitude = num;
            }
        }
        return maxMagnitude;
    }
}
