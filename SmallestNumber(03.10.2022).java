/**
 * create multi dimentional array.
 * If any one number in the 
 * first array must be less than 
 * both number in next array print
 * that number.
 */
public class SmallestNumber {
    public static void main(String[] args) {
        final int numberLimit = 2;
        int numbers [][] = {{10,20}, {11,21}, {12,25}, {5,6}};

        for(int row = 0; row < numbers.length - 1; row++) {
            for(int firstElement = 0; firstElement < numbers[row].length; firstElement++) {
                int count = 0;
                for(int secondElement = 0; secondElement < numbers[row].length; secondElement++) {
                    if (numbers[row][firstElement] < numbers[row + 1][secondElement]) {
                        count++;
                    }
                }
                if(count == numberLimit) {
                    System.out.println(numbers[row][firstElement]);
                }
            }
        }
    }
}