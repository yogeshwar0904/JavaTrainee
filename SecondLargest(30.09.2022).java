import java.util.Arrays;
import java.util.Scanner;


/**
 * Find the second largest number
 * in given array.
 */
public class SecondLargest {
    public static void main(String[] args) {
        secondLargest();
    }
    public static int[] secondLargest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int numbers [] = new int[size];
        System.out.println("Enter the numbers to initialize");

        for(int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int firstMaxNumber = 0;
        int secondMaxNumber = 0;
    
        for(int numberCopy : numbers) {
            if(numberCopy > firstMaxNumber) {
                secondMaxNumber = firstMaxNumber;
                firstMaxNumber = numberCopy; 
            } else if (numberCopy > secondMaxNumber) {
                secondMaxNumber = numberCopy;
            }
        }
        System.out.println(firstMaxNumber);
        System.out.println(secondMaxNumber);
        return numbers;
    }
}