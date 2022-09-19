import java.util.Scanner;


public class NumberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt(); 
        System.out.println("Enter the second number");    
        int secondNumber = scanner.nextInt();
        firstNumber = firstNumber + secondNumber;  
        secondNumber = firstNumber - secondNumber; 
        firstNumber = firstNumber - secondNumber;
        System.out.println("the given numbers swaped succesfully");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Second Number = " + secondNumber);
    }
}