public class Reverse {

    public static void main(String[] args) {
        String name = "welcome to ideas2it";
        String [] indexSplit = name.split(" ");
        int reverse ="";
        for(int iteration = 0; iteration < indexSplit.length(); iteration++) {
            for(int index = indexSplit.length(); intex > 0 ; index--) {
                reverse = reverse + indexSplit[iteration];
            }
        }
        System.out.println("The reveresed word is = " + reverese );
    }
}