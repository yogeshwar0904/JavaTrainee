import java.util.Scanner;


public class Palindrome {
    
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome();
        Scanner scan = new Scanner(System.in);
    }

    public String isPalindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String givenValue = scan.nextLine();
        char[] givenValueCopy = givenValue.toCharArray();
        String reverseValue  = "";
        for(int index = givenValueCopy.length - 1; index >= 0; index--) {
            reverseValue = reverseValue + givenValueCopy[index];
        }

        if(givenValue.equals(reverseValue)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println(" not a palindrome");
        }
        return givenValue;
    }
}