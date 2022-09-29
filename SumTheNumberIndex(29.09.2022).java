import java.util.Arrays;
import java.util.Scanner; 


/**
 *Add the any two number in given array
 *if it gives the value '8' and print that number.
 */ 
public class SumTheNumberIndex {
    public static void main(String[] args) {
        getSumOfNumbers();
    }

    public static int [] getSumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = scanner.nextInt();
        int numbers [] = new int[size];
        System.out.println("Enter the number to initialize");

        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();      
        }    
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter the sum of an Array numbers");
        int sum = scanner.nextInt();
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;

        while (lastIndex > firstIndex) {
            if(numbers[lastIndex] + numbers[firstIndex] > sum) {
                lastIndex--;
            }
            else if (numbers[lastIndex] + numbers[firstIndex] < sum) {
                firstIndex++;
            }
            else if (numbers[lastIndex] + numbers[firstIndex] == sum) {
                System.out.println(numbers[firstIndex] + "," + numbers[lastIndex]);
                lastIndex--;
                firstIndex++;
            }
        }
        return numbers;
    }
}
