
public class Main {

    ///
    /// A method that calculates the numeric differential between '(' and ')'
    ///
    public static int findFloor(String instructions) {
        int floor = 0;

        for (char instruction : instructions.toCharArray()) {
            if (instruction == '(') {
                floor++;
            } else if (instruction == ')') {
                floor--;
            }
        }

        return floor;
    }

    ///
    /// The starting point of the program
    ///
    public static void main(String[] args) {
        // Example instructions
        String instructions = "(()(()()(()))))))((((()()()))))((())";

        int finalFloor = findFloor(instructions);
        System.out.println("Santa ends up on floor: " + finalFloor);
    }
}
