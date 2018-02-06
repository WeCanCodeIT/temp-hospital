package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest = new Doctor("1111","Phil");

	/**
	 * This test uses state verification.
	 */
	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();
		
		int bloodsBefore = patient.getBloods();
		
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	boolean wasBled = false;
	
	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}
	
	/**
	 * This test uses behavior verification.
	 */
	@Test
	public void shouldDrawBloodFromTestDouble() {
		Bleedable patient = new BleedableDouble();
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor("","");
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(90000));
	}
	
	@Test
	public void shouldIncreasePatientHealth() {
		
		Patient patient = new Patient();
		
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();
		assertThat(healthAfter-healthBefore, is(10));
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "1111");
		
	}
	
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "Phil");
		
	}
}
