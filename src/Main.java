import solutions.Day1;

public class Main {

    /**
     * The entry point of the program
     * 
     * @param   args    Accepts command line arguments but does nothing in this case
     */
    public static void main(String[] args) {

        int dayNum = 1;
        Day1 day = new Day1();

        System.out.print("Day " + dayNum + ": " +
                        "\nPart one: " + day.partOne() + 
                        "\nPart two: " + day.partTwo());
    }
}
