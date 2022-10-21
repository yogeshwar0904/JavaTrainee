import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * To merge the two array
 * numbers.
 */

public class MergeArrays {
    public static void main(String[] args) {
        combineArray();
    }
   
    public static void combineArray() {
        boolean isContinue = false;
        do {
            try {
                int size;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Initialize size of first arry");
                size = scanner.nextInt(); 
                int firstNumbersList [] = new int[size];

                for(int index = 0; index <= firstNumbersList.length - 1; index++) {
                    System.out.println("Enter the numbers = " + index);
                    firstNumbersList[index] =scanner.nextInt(); 
                }
                int listSize;
                System.out.println("Initialize size of second arry");
                listSize = scanner.nextInt(); 
                int secondNumbersList [] = new int[listSize];

                for(int index = 0; index <= secondNumbersList.length - 1; index++) {
                    System.out.println("Enter the numbers = " + index);
                    secondNumbersList[index] =scanner.nextInt(); 
                } 
                int firstNumbersListSize;
                int secondNumbersListSize;
                int joinArrays;
                firstNumbersListSize = firstNumbersList.length;
                secondNumbersListSize = secondNumbersList.length;
                joinArrays = firstNumbersListSize + secondNumbersListSize;
                int totalNumbersList [] = new int[joinArrays];
                System.arraycopy(firstNumbersList, 0, totalNumbersList, 0, firstNumbersListSize);
                System.arraycopy(secondNumbersList, 0, totalNumbersList, 
                                 firstNumbersListSize, secondNumbersListSize);

                System.out.println(Arrays.toString(firstNumbersList));
                System.out.println(Arrays.toString(secondNumbersList));
                System.out.println(Arrays.toString(totalNumbersList));
            } catch (InputMismatchException inputmismatch) {
                System.out.println("enter wrong formate");
                isContinue = true;
            }
        } while(isContinue);
    }
}