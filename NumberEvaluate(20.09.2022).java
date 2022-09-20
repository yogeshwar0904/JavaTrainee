import java.util.Scanner;


public class NumberEvaluate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        final int numberLimit = 50;
        final int multipleOfThree = 3;
        final int multipleOfFive = 5;
        final int resultNumber = 0;
        int number = scanner.nextInt();
        if(number <= numberLimit) {
            if(number % multipleOfThree == resultNumber 
                && number % multipleOfFive == resultNumber) {
                System.out.println( number + " " + "FizzBuzz"); 
            } else if(number % multipleOfThree == resultNumber) {
                System.out.println( number + " " + "Fizz");
            } else if(number % multipleOfFive == resultNumber) {
                System.out.println( number + " " + "Buzz");
            }                          
        } else {
            System.out.println("the given number is invalid");
        }
    }
}