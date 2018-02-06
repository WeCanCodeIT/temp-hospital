package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	
	@Test
	public void shouldDrawBlood() {
		Nurse underTest = new Nurse();
		Patient patient = new Patient();
		
		int bloodsBefore = patient.getBloods();
		
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Nurse();
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(50000));
	}
	
	@Test
	public void shouldIncreasePatientHealth() {
		Nurse underTest = new Nurse();
		Patient patient = new Patient();
		
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter-healthBefore, is(5));
	}

}
