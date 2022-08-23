import java.util.Scanner;
import java.util.Arrays;

/**
 *Sorting the employee profile based on
 *some condition.
 * @version     1.0 16 Aug 2022
 * @author      Yogeshwar
 */

public class EmployeeProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employee you want to print");
        int employeeCount = scanner.nextInt();
        String employeeNames [] = new String[employeeCount];
        double employeeSalary [] = new double [employeeCount]; 
        int employeeExperience [] = new int [employeeCount];
        int employeeExperienceCopy [] = new int [employeeCount];
        double employeeSalaryCopy [] = new double [employeeCount]; 
        int SortedEmployeeExpirience[] = new int[employeeCount];
        final int experienceSort = 5;
        final int salarySort = 100000;
        
        for(int index = 0; index < employeeCount; index++) {
            System.out.println("enter the name");
            employeeNames[index] = scanner.next();
            System.out.println("enter the expirience");
            employeeExperience[index] = scanner.nextInt();
            System.out.println("enter the salary");
            employeeSalary[index] = scanner.nextDouble();
        }

        /*The employee earn more than onelakhs are sorted here*/

        StringBuilder printStatement = new StringBuilder();
        printStatement.append("  ");
        printStatement.append("employee yearn more than one lakhs");

        for(int element = 0; element < employeeCount; element++) {
            if(employeeSalary[element] > salarySort) {
                System.out.println(employeeNames[element] + printStatement);   
            }
        }

        /* The employee have more than five year expirience are sorted here*/

        StringBuilder printingStatement = new StringBuilder();
        printingStatement.append(" "); 
        printingStatement.append("employee have more than five year of expirience");
    
        for(int index = 0; index < employeeCount; index++) {
            if(employeeExperience[index] > experienceSort) {
                System.out.println(employeeNames[index] + printingStatement);
            }	
        }
    
        /*the employee have highest experience in the company are sorted here*/ 

        for(int index = 0; index < employeeCount; index++) {
            employeeExperienceCopy[index] = employeeExperience[index];
        }
 
        for(int index = 0; index < employeeCount - 1; index++) {
            for(int element = 0; element < employeeCount - 1; element++) {
                if(employeeExperience[element] < employeeExperience[element + 1]) {
                    int temporaryStoring = employeeExperience[element];
                    employeeExperience[element] = employeeExperience[element+1];
                    employeeExperience[element+1] = temporaryStoring;
                }    
            }
        }
        StringBuilder printTheStatement = new StringBuilder();
        printTheStatement.append("is");
        printTheStatement.append("highest expirienced people");

        for(int index = 0; index < employeeCount; index++) {
            if(employeeExperience[0] == employeeExperienceCopy[index]) {
                 System.out.println(employeeNames[index] + printTheStatement);   
            }
        }

        /*the employee earn highest salary in the company are sorted */

        for(int index = 0; index < employeeCount; index++) {
            employeeSalaryCopy[index] = employeeSalary[index];
        }

        for(int index = 0; index < employeeCount - 1; index++) {
            for(int element = 0; element<employeeCount - 1; element++) {
                if(employeeSalary[element] < employeeSalary[element+1]) {
                    double temporaryStoring = employeeSalary[element];
                    employeeSalary[element] = employeeSalary[element+1];
                    employeeSalary[element+1] = temporaryStoring;
                }    
            }       
        }
        StringBuilder statementLine = new StringBuilder();
        statementLine.append("is");
        statementLine.append("Getting highest salary");

        for(int index = 0; index < employeeCount; index++) {
            if(employeeSalary[0] == employeeSalaryCopy[index]) {
                System.out.println(employeeNames[index] + statementLine);   
            }
        }

        /*Top five expirienced employee are sorted*/

        for(int element = 0; element < employeeCount - 1; element++) {
            SortedEmployeeExpirience[element] = employeeExperience[element];
        }
        StringBuilder statement = new StringBuilder();
        statement.append("is");
        statement.append("top five expirienced people");

        for (int index = 0; index < employeeCount; index++) {
            for (int number = 0; number < employeeCount; number++) {
                if (SortedEmployeeExpirience[number] == employeeExperience[index]) {
                    System.out.println(employeeNames[index] + statement);
                }
            }
        }
    }
}

       



