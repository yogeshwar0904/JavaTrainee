import java.util.Scanner;


/**
 * check the charecter is a 
 * vowels or a consonant
 */
public class VowelEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char vowels = scanner.next().charAt(0);
        int ascii = vowels;
        final int UPPERCASE_A = 65;
        final int UPPERCASE_E = 69;
        final int UPPERCASE_I = 73;
        final int UPPERCASE_O = 79;
        final int UPPERCASE_U = 85;
        final int LOWERCASE_A = 97;
        final int LOWERCASE_E = 101;
        final int LOWERCASE_I = 105;
        final int LOWERCASE_O = 111;
        final int LOWERCASE_U = 117;
        final int MAX_NUMBER = 122;
        final int MINIMUM_NUMBER = 90;

        if(vowels == UPPERCASE_A || vowels == UPPERCASE_E || vowels == UPPERCASE_I
           || vowels == UPPERCASE_O || vowels == UPPERCASE_U)
            System.out.println("\n\'" + vowels + "\' is an Uppercase Vowel.");
        else if(vowels == LOWERCASE_A || vowels == LOWERCASE_E || vowels == LOWERCASE_I 
                || vowels == LOWERCASE_O || vowels == LOWERCASE_U)
            System.out.println("\n\'" + vowels + "\' is a Lowercase Vowel.");
        else {
            if((ascii >= UPPERCASE_A && ascii <= MINIMUM_NUMBER) 
                || (vowels >= LOWERCASE_A && vowels <= MAX_NUMBER ))
                System.out.println("\n\'" + vowels + "\' is a Consonant.");
            else
                System.out.println("\n\'" + vowels + "\' is neither a Vowel nor a Consonant.");
        }
    }
}
