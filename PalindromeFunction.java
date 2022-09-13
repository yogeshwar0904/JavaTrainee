public class PalindromeFunction {
    public static void main(String[] args) {
        int number = 131;
        int temporary = number;
        int initialNumber = 0;
        while(number > 0) {
        int reminder = number % 10;
        initialNumber = initialNumber * 10 + reminder;
        number = number / 10;
        }
        if(temporary == initialNumber) {
            System.out.println("The Given Number is a Palindrome");   
        }
        else {
            System.out.println("The Given Number is not a Palindrome");
        }
    }
}