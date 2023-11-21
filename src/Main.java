
public class Main {

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

    public static void main(String[] args) {
        // Example instructions
        String instructions = "(()(()()(()))))))((((()()()))))((())";

        int finalFloor = findFloor(instructions);
        System.out.println("Santa ends up on floor: " + finalFloor);
    }
}
