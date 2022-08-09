/*
 *Let us consider two words and some set of sentence
 *if that two words present in the given sentence
 *we must print that sentence.
 */
public class CheckTheLetter {
    
    public static void main(String[] args) {
        String s = "the article was arrested";
        String s1 ="ar";
        String [] s2 = s.split(" ");

        for(String s3 : s2) {

            if(s3.contains(s1)) {
                System.out.println(s3);
            }
        }
    }
}  