package hospital;

public class Nurse extends Employee implements MedicalDuties {

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);

	}

	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(5);

	}

	@Override
	public int getSalary() {
		return 50000;
	}

}
