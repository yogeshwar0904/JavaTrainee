import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class EmployeeSalary{

    public static void main(String[] args) {
        Deque<Double> salary = new ArrayDeque<Double>();
        salary.add(500000.0);
        salary.add(300000.0);
        salary.add(100000.0);
        salary.add(200000.0);
        salary.poll();
        Iterator iterator = salary.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
