package solutions;

import java.util.Arrays;

import utils.Utils;

public class Day2 {

    public static int day;
    private int[][] presents;
    private static Utils utils = new Utils();

    /**
     * Default constructor, this gets called every time we use this class and sets
     * up the basic variables that will be used everytime a new object of this
     * class is made
     */
    public Day2() {
        day = 2;
        presents = utils.getStringAs3DArray(day);
    }

    /**
     * A method to solve the first part of the day and return the needed sq ft of wrapping paper
     * 
     * @return an integer value of how much wrapping paper is needed in square feet
     */
    public int partOne() {
        int totalWrappingPaperSqFt = 0;
        for (int[] present : presents) {
            totalWrappingPaperSqFt += getSurfaceAreaAndSmallestSideExtra(present[0], present[1], present[2]);
        }
        return totalWrappingPaperSqFt;
    }

    /**
     * Calculate the amount of ribbon needed to wrap the presents
     * 
     * @return
     */
    public int partTwo() {
        int totalBow = 0;
        int totalRibbon = 0;
        
        for (int i = 0; i < presents.length; i++) {
            totalBow += presents[i][0] + presents[i][1] + presents[i][2];
            totalRibbon += getSmallestSidePerimeter(presents[i][0], presents[i][1],  presents[i][2]);
        }
        return totalRibbon + totalBow;
    }

    public int getSurfaceAreaAndSmallestSideExtra(int l, int w, int h) {

        int smallestSide = 0;
        int side1 = 2 * l * w;
        int side2 = 2 * w * h;
        int side3 = 2 * l * h;

        if (side1 <= side2 && side1 <= side3) {
            smallestSide = side1 / 2;
        } else if (side2 <= side1 && side2 <= side3) {
            smallestSide = side2 / 2;
        } else if (side3 <= side1 && side3 <= side3) {
            smallestSide = side3 / 2;
        }
        return side1 + side2 + side3 + smallestSide;
    }

    private int getSmallestSidePerimeter(int l, int w, int h){
        int[] dimensions = new int[]{l, w, h};
        Arrays.sort(dimensions);   
        return dimensions[0] + dimensions[1];
    }
}
