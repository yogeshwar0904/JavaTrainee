import java.util.Scanner;


public class EvaluatorPrimeNumber {
    final static int FIXED_NUMBER = 2;

    public static void main(String[] args) {
        EvaluatorPrimeNumber primeNumbers = new EvaluatorPrimeNumber();
        primeNumbers.isPrime();
    } 

    public int[] isPrime() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number to check it is prime or not");
        int userInput = scanner.nextInt();
        for(int index = 0; index < number.length - 1; index++) {
            if(userInput % number[index] == 0 ) {
                count++; 
            }
        }
        System.out.println("The count = " + count);
        if(count > FIXED_NUMBER || userInput == 0 || userInput == 1 ) {
            System.out.println("the given number is not a prime number");
        } else {
            System.out.println("the given number is a prime number");
        }
        return number;
    }
}