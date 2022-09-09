public class EmployeeData {
    private String name;
    private double salary;
    private int experience;

    public EmployeeData(String name,  int experience,double salary) {
	super();
	this.name = name;
	this.salary = salary;
	this.experience = experience;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public int getExperience() {
	return experience;
    }

    public void setExperience(int experience) {
	this.experience = experience;
    }

    @Override
    public String toString() {
	return "Employee [name=" + name + ", salary=" + salary
                    + ", experience=" + experience + "]";
    }
}
