package utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class is intended to house all methods that may be reused multiple times
 * throughout AdventOfCode 2015, if you feel the need to reuse a method in any
 * of your attempts, consider relocating that method into this common class
 * so that it may be reused easier
 */
public class Utils{

    public String text;
    private String inputPath;

    /**
     * Default constructor, this gets called every time we use this class and sets
     * up the basic variables that will be used everytime a new object of this
     * class is made
     */
    public Utils(){
        text = "";
        inputPath = "src/inputs/day";
    }

    /**
     * This method accepts a day (integer) and returns the input file as one string
     * 
     * @param   day an integer representation of which date in December we are using
     * @return      the file contents as a string
     */
    public String getInputAsString(int day){
        //This needs to be wrapped in a try/catch as reading from a file can fail, resulting in an exception
        try {
            //The following lines could also be simplified as follows, left as is just for understanding what is happening here
            //text = new String(Files.readAllBytes(Paths.get(inputPath + Integer.toString(day) + ".txt")))
            String pathString = inputPath + Integer.toString(day) + ".txt";
            Path path = Paths.get(pathString);
            text = new String(Files.readAllBytes(path));
        } catch (Exception e) {
            System.out.println("File could not be read at '" + inputPath + "'");
        }
        return text;
    }

    public int[][] getStringAs3DArray(int day){

        String input = getInputAsString(day);
        
        String[] lines = input.split("\n");
        int[][] allDimensions = new int[lines.length][3];
        
        for (int i = 0; i < lines.length; i++) {
            String[] dimensions = lines[i].split("x");
            for (int j = 0; j < 3; j++) {
                allDimensions[i][j] = Integer.parseInt(dimensions[j]);
            }   
        }

        return allDimensions;
    }
}