import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Print the pattern in Pascals
 * triangle.
 */
public class PascalTriangle {
    public int factorial(int index) {
        if (index == 0)
            return 1;
        return index * factorial(index - 1);
    }

    public static void main(String[] args) {
        boolean isContinue = false;
        do {
            try {
                PascalTriangle pattern = new PascalTriangle();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number to design Pascal pattern");
                int numberLimit = scanner.nextInt();
                for (int index = 0; index <= numberLimit; index++) {
                    for (int element = 0; element <= numberLimit - index; element++) {
                        System.out.print(" ");
                    }
                    for (int element = 0; element <= index; element++) {
                        System.out.print(" " + pattern.factorial(index) / (pattern.factorial(index - element)
                                               * pattern.factorial(element)));
                    }
                    System.out.println();
                }
            } catch (InputMismatchException exception) {
                System.out.println("Entered invalid formate try again");
                isContinue = true;
            }
        } while (isContinue);
    } 
}