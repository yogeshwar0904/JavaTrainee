import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Evaluator {
    static Scanner scan = new Scanner(System.in);

    public static boolean getInputFromUser(Map<Integer, 
        List<EmployeeData>> employeeData, List<EmployeeData> employeeTable) {
        System.out.println("How many employees you want to store");
	int totalEmployee = scan.nextInt();
	for (int index = 1; index <= totalEmployee; index++) {
	    System.out.println(index + " EmployeeData");
	    System.out.println("Enter Employee ID ");
	    int EmpID = scan.nextInt();
	    System.out.println("Enter EmployeeName,Experience & salary");
	    String Name = scan.next();
	    int Experience = scan.nextInt();
	    double Salary = scan.nextDouble();
	    employeeTable.add(new EmployeeData(Name, Experience, Salary));
	}
        return true;
    }

    public static String getGreaterThanFixedSalay
                           (List<EmployeeData> employeeTable) {
        String name = "Employee Not Available";
	System.out.println("Did you want to filter the salary press \"1\"");
	int press = scan.nextInt();
	if (press == 1) {
	    System.out.println("filter salary based on which AMOUNT");
            double fixedSalary = scan.nextDouble();
	    Iterator iterator = employeeTable.iterator();
	    while (iterator.hasNext()) {
	        EmployeeData employee = (EmployeeData) iterator.next();
		if (employee.getSalary() > fixedSalary) {
		    name = employee.getName();
		} 
	    }	    
	}
        return name;
    }

    public static String getMaximumSalary
                           (List<EmployeeData> employeeTable) {
	double maximumSalary = 0.0;
	String name = "Employee Not Available";
	for (EmployeeData employeeTableCopy : employeeTable) {
            if (employeeTableCopy.getSalary() > maximumSalary) {
		maximumSalary = employeeTableCopy.getSalary();
		name = employeeTableCopy.getName();
	    }
	}
	return name;
    }

    public static String getGreaterThanFixedExperience
                           (List<EmployeeData> employeeTable) {
        System.out.println("Did you want to filter the Experience press \"2\"");
	int press = scan.nextInt();
        String name = "Employee Not Available";
        if (press == 2) {
	    System.out.println("filter experience based on which YEAR");
	    double fixedExperience = scan.nextDouble();
	    Iterator iterator = employeeTable.iterator();
	    while (iterator.hasNext()) {
	        EmployeeData employee = (EmployeeData) iterator.next();
		if (employee.getExperience() > fixedExperience) {
		     name = employee.getName();                           
		}
	   }  
	}
        return name;
    }

    public static String getMaximumExperience
                          (List<EmployeeData> employeeTable) {
        int maximumExperience = 0;
	String name = "Employee Not Available";
	for (EmployeeData emp : employeeTable) {
            if (emp.getExperience() > maximumExperience) {
	        maximumExperience = emp.getExperience();
		name = emp.getName();
	    }
	}
        return name;
    }
}