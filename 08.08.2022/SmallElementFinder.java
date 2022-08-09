/*
 *Comparing the element in an array with the next index
 *if atleast one  elements in an  array(0th index element) is less than next
 *array of all element(1st index element).
 *we must print that element(0th index element). 
 */
public class SmallElementFinder { 

    public static void main(String[] args) {
        int number [][] = {{10,12},{13,11},{15,18},{16,17}};
     
        for (int index = 0; index < number.length-1; index++) {
            for (int element = 0; element < number[index].length; element++) {
                int count = 0;

                for (int nextIndex = 0; nextIndex < number[index].length; nextIndex++) {
               
                    if (number[index][element] < number[index+1][nextIndex]) {
                        count ++;
                    }
                }

                if (count == 2) {
                     System.out.println(number[index][element]);
                }
            }
        }
    }      
}
    
