package solutions;

import utils.Utils;

public class Day1 {

    public static int day;
    private String input;
    private int floorNumber;
    private static Utils utils = new Utils();

    /**
     * Default constructor, this gets called every time we use this class and sets
     * up the basic variables that will be used everytime a new object of this
     * class is made
     */
    public Day1(){
        day = 1;
        floorNumber = 0;
        input = utils.getInputAsString(day);
    }

    /**
     * A method to solve the first part of the day and returns the arrival floor
     * 
     * @return  an integer value of which floor number we arrive on
     */
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

    /**
     * A method to solve the second part of the day and returns how many floors
     * are traversed before the first basement level is reached (+1 because of 0-index)
     * 
     * @return  how many floors are traversed before the first basement level is reached,
     *          -1 is returned if never reached
     */
    public int partTwo(){

        //A char array of the input string
        char[] inputArray = input.toCharArray();

        //Loops through all chars
        for (int i = 0; i < inputArray.length; i++) {
            //Go up a floor
            if(inputArray[i] == '('){
                floorNumber++;
            }
            //Go down a floor
            else if(inputArray[i] == ')'){
                floorNumber--;
            }
            //Check if the current floor is the first basement level
            if(floorNumber == -1){
                return i+1;
            }
        }
        return -1;
    }
}
