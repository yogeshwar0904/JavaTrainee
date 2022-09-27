import java.util.Scanner;


/**
 * The given number is divisible by the posible numbers.
 * these sum of posible number equal to the given 
 * number called Perfect Number.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.isPerfectnumber();
    }

    public int isPerfectnumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check Prefect Number or Not");
        int givenNumber = scanner.nextInt();
        int sum = 0;
  
        for (int index = 1; index < givenNumber; index++) {
            if (givenNumber % index == 0) {
                sum = sum + index;
            }           
        }

        if (sum == givenNumber) {
            System.out.println(givenNumber + " is a Perfect Number");
        } else {
            System.out.println(givenNumber + "is NOT a Perfect Number");
	}
        return givenNumber;
    }
}
 