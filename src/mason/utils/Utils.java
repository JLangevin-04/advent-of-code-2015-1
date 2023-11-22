package mason.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils{

    private String inputPath = "src/mason/inputs/day";

    public String getInputAsString(int day){
        String text = "";
        try {
            String pathString = inputPath + Integer.toString(day) + ".txt";
            Path path = Paths.get(pathString);
            text = new String(Files.readAllBytes(path));
        } catch (Exception e) {
            System.out.println("File could not be read at '" + inputPath + "'");
        }
        return text;
    }
}