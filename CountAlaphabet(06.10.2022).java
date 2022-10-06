import java.util.Scanner;


/**
 * Count the each charecter 
 * in a given letter.
 */
public class CountAlaphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to count the alphabets");
        String word = scanner.nextLine();
        char [] alphabets = word.toCharArray() ;
        for(int index = 0; index < alphabets.length; index++) {
            if(alphabets[index] != '*') {
                int count = 1;
                for(int element = index + 1; element < alphabets.length; element++) {
                    if(alphabets[index] == alphabets[element]) {
                        count++;
                        alphabets[element] = '*';
                    } 
                }
                System.out.println(alphabets[index] + " = " +count);
            }
        }
    }
}