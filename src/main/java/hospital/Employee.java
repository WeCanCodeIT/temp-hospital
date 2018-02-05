package hospital;

public abstract class Employee {

	public String salaryInfo() {
		return "This employee's salary is " + getSalary();
	}
	public abstract int getSalary();
}
