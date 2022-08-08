import java.util.Arrays;

public class NumberArrangement {

    public static void main(String[] args) {
        int [] number = {3,7,9,0,1,5};
        
        for(int row = 0; row <number.length; row++) {
            for(int col = row + 1; col <number.length; col++) {
                if(number[row] > number[col]) {
                    int temporary = number[row];
                    number[row] = number[col];
                    number[col] = temporary;
                }
            } 
        }
        System.out.println(Arrays.toString(number));
    }
} 