import java.util.Vector;


public class VectorExample {
    public static void main(String[] args) {
        String employeeNameList [] = names();
        System.out.println(employeeNameList.toString());
    }

    public static String[] names() {
        Vector<String> name = new Vector<String>();
        String employeeName [] = new String[100];
        name.add("yogesh");
        name.add("harish");
        name.add("venoth");
        name.addElement("jeeva");
        System.out.println("Search : " + name.contains("jeeva"));
        name.remove("venoth");
        System.out.println(name.elementAt(1));
        for(int index = 0; index < name.size(); index++) {
            employeeName [index] = name.elementAt(index);
            System.out.println(employeeName);
        }    
         return employeeName;
    }
}
