import java.util.Scanner;

/**
 * The sun rising to the given array number 
 * from left to right.so first number consider
 * as minimum tallest number and next number
 * is greater than minimum tallest, sun rise on
 * that number,Then count sun rising number.
 */
public class BuildingVisiblity {
    public static void main(String[] args) {
        countBuildingVisibility();
    }

    private static int countBuildingVisibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array to initialize");
        int size = scanner.nextInt();
        int numbers [] = new int[size];
        System.out.println("Enter number to initialize in an array");

        for(int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }
        int count = 0;
        int maximumNumber = numbers[0]; 

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] >= maximumNumber) {
                count++;
                maximumNumber = numbers[index];
            }
        }
        System.out.println("The number of building visibility " + count);
        return count;
    }
}