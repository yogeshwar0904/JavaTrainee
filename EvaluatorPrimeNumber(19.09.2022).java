import java.util.Scanner;


public class EvaluatorPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean primeNumber = true;
        System.out.println("Enter the number to check prime or not");
        int number = scanner.nextInt();
        int index = 2;
        while(index < number) {
            if(number % index == 0) {
                System.out.println("the given number is not a prime");
                primeNumber = false;
                break;
            }
            index = index + 1;               
        }
        if(primeNumber == true) {
            System.out.println("the given number is a prime");
        }
    }
}