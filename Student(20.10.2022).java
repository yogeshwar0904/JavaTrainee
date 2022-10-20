import java.util.LinkedList;
import java.util.List;


/**
 * To Filter the common name
 * from the two diffrent list.
 */
public class Student {
    public static void main(String[] args) {
        getCommonNameList();
    }

    public static List<String> getCommonNameList() {
        List<String> studentList = new LinkedList<String> ();
        studentList.add("Yogesh");
        studentList.add("Ajith");
        studentList.add("Vimal");
        studentList.add("Santhose");
        System.out.println("List of Student Name " + studentList);

        List<String> teacherList = new LinkedList<String> ();
        teacherList.add("Nirmal");
        teacherList.add("ashok");
        teacherList.add("Vimal");
        teacherList.add("giri");
        System.out.println("List of teacher Name " + teacherList);

        List<String> commonNameList = new LinkedList<String>(studentList);
        commonNameList.retainAll(teacherList);
        System.out.println("List of Common Name " + commonNameList);
        return commonNameList;
    }
}