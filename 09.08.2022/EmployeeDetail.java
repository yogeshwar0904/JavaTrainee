/*
 *here we use the getter and setter method
 *to initialise the employee details.
 */
public class EmployeeDetail {
    private int id;
    private String name;
    private double salary;
    
    public int getid () {
        return id;
    }

    public void setid (int id) {
        this.id = id;
    }
    
    public String getname () {
        return name;
    }

    public void setname (String name) {
        this.name = name;
    }

    public double getsalary () {
        return salary;
    }
    
    public void setsalary (double salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        EmployeeDetail profile = new EmployeeDetail ();
        profile.setid (198);
        profile.setname ("yogesh");
        profile.setsalary (300000.0);
        System.out.println(profile.getid());
        System.out.println(profile.getname());
        System.out.println(profile.getsalary());
    }
} 









