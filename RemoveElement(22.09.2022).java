public class RemoveElement {
    public static void main(String[] args) {
        int number [] = {7,3,4,5,1,2};
        int numberLimit = number.length;
        int position = 4;
        for(int index = 0; index < numberLimit; index++) {
            if(index != position) {
                System.out.println(number[index]);
            }
        }
    }
}