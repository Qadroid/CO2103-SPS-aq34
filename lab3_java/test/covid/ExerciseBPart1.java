package covid;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExerciseBPart1 {

	@Test
	void CovidSwabTestFieldExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = getClass().getClassLoader().loadClass("covid.CovidSwabTest");
		assertNotNull(c.getDeclaredField("swabId"));
	}
	
	@Test
	void createSwabTest() {
		assertTrue(new CovidSwabTest("2133532") instanceof CovidTest); 
	}
	
	@Test
	void CovidAntiBodyTestFieldExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = getClass().getClassLoader().loadClass("covid.CovidAntiBodyTest");
		assertNotNull(c.getDeclaredField("bloodSampleId"));
	}
	
	@Test
	void createAntiBodyTest() {
		assertTrue(new CovidAntiBodyTest("2133532") instanceof CovidTest); 
	}
}
