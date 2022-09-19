/*
 *Here we derive the diffrence for  mutable and immutable
 * in string class by equals method and "==" symbole.
 */
 public class StringClass {
     public static void main (String[] args) {
        String litralValue = "yogesh";
        String litralValues = "yogesh";
        String newObject = new String("yogesh");
        String newObjects = new String("yogesh");
        System.out.println(litralValue == litralValues);            //true*****object(give the result based on object and address)
        System.out.println(litralValue.equals(litralValues));       //true*****object(give the result based on object)
        System.out.println(newObject == newObjects);                //false*****object(give the result based on address)
        System.out.println(newObject.equals(newObjects));           //true*****object(give the result based on object)
        System.out.println(litralValue == newObject);               //false*****object(give the result based on address)
        System.out.println(litralValue.equals(newObject));          //true*****object(give the result based on object)
        System.out.println(newObject == newObjects);                //false*****object(give the result based on address)
        System.out.println(newObject.equals(newObjects));           //true*****object(give the result based on object)
    }
} 
