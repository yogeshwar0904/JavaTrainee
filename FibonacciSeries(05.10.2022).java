import java.util.Scanner;


/**
 * Fibonacci series using Array
 * Add previous two numbers gives
 * the current number
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        fetchFibonacciNumber();
    }
  
    public static int[] fetchFibonacciNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total fibonacci number");
        int size = scanner.nextInt();
        int numbers [] = new int[size];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int index = 2; index < size; index++) {
            numbers[index] = numbers[index - 1] + numbers[index - 2];
        }
     
        for (int index = 0; index < size; index++) {
            System.out.println(numbers[index]);
        }
        return numbers;
    }
}