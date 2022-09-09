import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *Sorting the employee profile based on
 *the conditions.
 * @version     1.0 16 Aug 2022
 * @author      Yogeshwar
 */

public class Controller {
    public static void main(String[] args) {
        Map<Integer, List<EmployeeData>> employeeData = new HashMap();
	List<EmployeeData> employeeTable = new ArrayList<>();
        boolean userAdded = Evaluator.getInputFromUser(employeeData,employeeTable);
            if (userAdded) {
                System.out.println("Employee added");
            } 
	String fixedSalaryEmployeename = Evaluator.getGreaterThanFixedSalay
                                                       (employeeTable);
        System.out.println(fixedSalaryEmployeename);
        String maximumSalaryEmployeename = Evaluator.getMaximumSalary
                                                        (employeeTable);
        System.out.println("Employee Getting Highest Salary " 
                              + maximumSalaryEmployeename );
        String fixedExperienceName = Evaluator.getGreaterThanFixedExperience
                                                   (employeeTable);
        System.out.println(fixedExperienceName);

        String maximumExperienceName = Evaluator.getMaximumExperience
                                                     (employeeTable);
        System.out.println("Employee have Highest Experience" 
                              + maximumExperienceName);
    }
}
