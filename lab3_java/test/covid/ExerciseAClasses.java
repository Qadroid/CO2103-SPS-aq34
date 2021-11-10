package covid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ExerciseAClasses {

	@Test
	void CovidTestExists() throws ClassNotFoundException {
		assertNotNull(getClass().getClassLoader().loadClass("covid.CovidTest"));
	}

	@Test
	void CovidTestFieldResultExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = getClass().getClassLoader().loadClass("covid.CovidTest");
		assertNotNull(c.getDeclaredField("result"));
	}

	@Test
	void CovidTestFieldResultCorrectType() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = getClass().getClassLoader().loadClass("covid.CovidTest");
		assertEquals(c.getDeclaredField("result").getType(), Result.class);
	}

	@Test
	void TestSiteExists() throws ClassNotFoundException {
		assertNotNull(getClass().getClassLoader().loadClass("covid.TestSite"));
	}

	@Test
	void TestSiteFieldTestsExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class<?> c = getClass().getClassLoader().loadClass("covid.TestSite");
		assertNotNull(c.getDeclaredField("tests"));
	}

	@Test
	void TestSiteAddTestExists() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
		Class<?> ct = getClass().getClassLoader().loadClass("covid.CovidTest");
		Class<?> ts = getClass().getClassLoader().loadClass("covid.TestSite");
		assertNotNull(ts.getDeclaredMethod("addTest", ct));
	}
}
