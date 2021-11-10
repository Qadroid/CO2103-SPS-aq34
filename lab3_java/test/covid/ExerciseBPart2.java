package covid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExerciseBPart2 {

	@Test
	void createSwabTest() {
		TestSite ts = new TestSite();
		CovidTest t = new CovidSwabTest("2133532");
		ts.addTest(t);
		ts.runTests();
		assertEquals(Laboratory.doTest("2133532"), t.getResult());
	}
	
	@Test
	void testSwabId() {
		CovidTest t = new CovidSwabTest("2133532");
		assertEquals("2133532", t.getSampleId());
	}
	
	@Test
	void testAntiBodyId() {
		CovidTest t = new CovidAntiBodyTest("absdklal");
		assertEquals("absdklal", t.getSampleId());
	}
	
}
