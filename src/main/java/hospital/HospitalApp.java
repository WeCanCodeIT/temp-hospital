package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Doctor phil = new Doctor("1111", "Phil");
		Surgeon harry = new Surgeon("2222", "Harry", true);
		Nurse jackie = new Nurse("3333", "Jackie");
		Janitor rosie = new Janitor("4444", "Rosie");

		Hospital hospital = new Hospital();
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(rosie);

		System.out.println("Here are the pay rates at High St. Hospital");
		hospital.showPayRates();
		
		System.out.println("Here are the employees with Medical Duties:");
		hospital.showAllMedicalPersonnel();
	}

}
