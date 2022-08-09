/*
 *let us consider one value '8' and we have one array with 
 *group of element.If we add any two element in an 
 *given array it must give the value '8' and we have to
 *print that two element.
 */
public class PrintTheSum {
    public static void main(String[] args) {
        int [] number = {5,6,1,7,8,4,2};
        int addTwonumber = 7;
        int firstIndex = 0;
        int lastIndex = number.length-1;

        while(lastIndex > firstIndex) {
        
            if(number [firstIndex] + number [lastIndex] > addTwonumber) {
                lastIndex--;
            } else if (number [firstIndex] + number [lastIndex] < addTwonumber) {
                firstIndex++;
            } else if (number [firstIndex] + number [lastIndex] == addTwonumber) {
                System.out.println(number [firstIndex] + "," + number [lastIndex]);
                firstIndex++;
                lastIndex--;
            }
        }
    }
}