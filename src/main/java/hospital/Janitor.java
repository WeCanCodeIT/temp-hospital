package hospital;

public class Janitor extends Employee {
	
	public Janitor(String empNumber, String empName) {
		this.empName = empName;
		this.empNumber = empNumber;
	}

	@Override
	public int getSalary() {
		
		return 40000;
	}

}
