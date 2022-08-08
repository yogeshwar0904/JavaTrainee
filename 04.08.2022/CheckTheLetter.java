public class CheckTheLetter {
    public static void main(String[] args) {
        CheckTheLetter search = new CheckTheLetter(); 
        search.presentWord();
    }
    
    public void presentWord() {
        char word = 'r';

        switch (word) {
        case 'g': 
            System.out.println("Colour is green ");
            break;
        case 'b': 
            System.out.println("Colour is black");
            break;
        case 'y': 
            System.out.println("Colour is yellow ");
            break;
        case 'r':
            System.out.println("Colour is red ");
            break;
        default : 
            System.out.println("Colour is black ");
            break;         }
    }
}
