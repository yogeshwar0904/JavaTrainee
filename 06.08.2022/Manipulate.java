class Manipulate {
    public static void main(String[] args) {
        manipulation();
    }

    /*if the number divisible by 2 those
      numbers must be multiplied with 
      eachother*/

    static void manipulation() {
        int a [] ={1,2,3,4,5,6};  
        int count =1;            
        for (int b : a) {
            if(b%2 == 0){
                count = count*b;
            }
        }
        System.out.println("the manipulation count ="+count);
    }
}