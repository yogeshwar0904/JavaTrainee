public class ReverseProcess {
    
    /*public static void main(String[] args) {
        char word [] = {'y','o','g','e','s','h','w','a','r'};
        String reverse = " "; 
        char pos = 5;
        for(int rev = word.length-1; rev >= pos ; rev--) {
            reverse = reverse + word[rev];
           
        }
        System.out.println(reverse);  
    }
}*/
    public static void main(String[] args) {
        String s ="yogeshwar";
        char [] y = s.toCharArray();
        string reverse = "";
         
        for(int i = 0; i <y.length; i++) {
            int pos = 5;
        for(int j = y.length; j >= pos; j--) {
            reverse = reverse + j[y];
        }
        }
}