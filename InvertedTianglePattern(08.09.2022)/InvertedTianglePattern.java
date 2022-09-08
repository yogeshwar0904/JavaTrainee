public class InvertedTianglePattern {
    final static int numberLimit = 4;

    public static void main(String[] args) {
        for(int row = 0; row < numberLimit; row++) {
            for(int coloumn = 0; coloumn < numberLimit; coloumn++) {
                  if (row <= coloumn) {
                      System.out.print("* ");
                  }
                  else {
                      System.out.print("  ");
                  }
	    }
            for(int coloumn = 0; coloumn < numberLimit; coloumn++) {
                  if (row + coloumn < numberLimit - 1) {
                      System.out.print("* ");
                  }
                  else {
                      System.out.print("  ");
                  }
            }
            System.out.println();
        }
    }
}