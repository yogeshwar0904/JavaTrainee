public class ConvertTheDatatype {
    public static void main(String[] args) {                         
        int smallData = 5;                                   
        float largeData = smallData ;                  // Converting smaller type of data to lager data type by implicitly.                            
        System.out.println(largeData);                 // This is called widening. 
        short minimumData  = 10;
        int maximumData = (int) minimumData ;          // Converting smaller type of data to lager data type by explicitly.
        System.out.println(maximumData);               // This is called widening.
        short same1Data  = 10;
        char sameData = (char) same1Data ;             // Converting same type of data it is done always  by explicitly.
        System.out.println(sameData); 
    }
}                                                                    
                                                                      
                                                                      
                                                                     
       