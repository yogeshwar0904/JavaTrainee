import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        selectionSort();
    }
   
    public static int[] selectionSort() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Initialize size of arry");
            int size = scanner.nextInt(); 
            int numbers [] = new int[size];
  
            for(int index = 0; index <= numbers.length - 1; index++) {
                System.out.println("Enter the numbers = " + index);
                numbers[index] =scanner.nextInt(); 
            } 
    
            for(int index = 0; index <= numbers.length - 1; index++) {
                int minimumNumber = numbers[index];
                int position = index;
            
                for(int element = index + 1; element < numbers.length ; element++) {
                    if(numbers[element] < minimumNumber) {
                        minimumNumber = numbers[element];
                        position = element;
                    }
                }
                int temporary = numbers[index];
                numbers[index] = numbers[position];
                numbers[position] = temporary; 
            }
            System.out.println(Arrays.toString(numbers));
        } catch (InputMismatchException inputmismatch) {
            System.out.println("enter wrong formate");
        }
        return numbers; 
    }
}