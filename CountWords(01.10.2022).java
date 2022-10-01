import java.util.HashMap;
import java.util.Scanner;


/**
 * Count the number of words using 
 * hashmap.
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> countWords = new HashMap<>();
        System.out.println("Enter the words to calculate");
        String words = scanner.nextLine();
        String splitWords [] = words.split(" ");

        for(int index = 0; index < splitWords.length; index++) {
            if(countWords.containsKey(splitWords[index])) {
                int count = countWords.get(splitWords [index]);
                countWords.put(splitWords [index], count+1);
            } else {
                countWords.put(splitWords [index], 1);  
            }
        }
        System.out.println(countWords);
    }
}