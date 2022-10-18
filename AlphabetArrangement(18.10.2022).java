import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Arrange the given word in
 *alphabetical order.
 */
 class AlphabetArrangement {
    public static void main(String[] args) {
        arrangeAlphabeticalOrder();
    }

    public static void arrangeAlphabeticalOrder() {
        String word;
        char temporary;
        int index = 0;
        boolean isContinue = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the word to re-arrange in accending order");
                word = scanner.nextLine();
                char [] wordCopy = word.toCharArray();

                while (index < wordCopy.length) {
                    int element = index + 1;
                    while (element < wordCopy.length) {
                        if (wordCopy[index] > wordCopy[element]) {
                            temporary = wordCopy[index];
                            wordCopy[index] = wordCopy[element];
                            wordCopy[element] = temporary;
                        }
                        element += 1;
                    }
                    index += 1;
                }
                System.out.println(wordCopy);
            } catch (InputMismatchException eception) {
                System.out.println("Entered invalid data!!");
                isContinue = true;
            } 
        } while (isContinue);
    }
}

