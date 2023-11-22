
public class Main {

    /**
     * The entry point of the program
     * 
     * @param   args    Accepts command line arguments but does nothing in this case
     */
    public static void main(String[] args) {

        int dayNum = 2;
        solutions.Day2 day = new solutions.Day2();

        System.out.print("Day " + dayNum + ": " +
                        "\nPart one: " + day.partOne() + 
                        "\nPart two: " + day.partTwo());
    }
}
