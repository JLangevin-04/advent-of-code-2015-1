package mason.solutions;

import mason.utils.Utils;

public class Day1 {

    public static int day;
    private String input;
    private int floorNumber;
    private static Utils utils = new Utils();

    public Day1(){
        day = 1;
        floorNumber = 0;
        input = utils.getInputAsString(day);
    }

    public int partOne(){
        
        int floorNumber = 0;

        for(char character : input.toCharArray()) {
            if(character == '('){
                floorNumber++;
            }
            else if(character == ')'){
                floorNumber--;
            }
        }
        return floorNumber;
    }

    public int partTwo(){

        char[] inputArray = input.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == '('){
                floorNumber++;
            }
            else if(inputArray[i] == ')'){
                floorNumber--;
            }
            if(floorNumber == -1){
                return i+1;
            }
        }
        return -1;
    }
}
