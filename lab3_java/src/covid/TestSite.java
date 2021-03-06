package covid;

import java.util.ArrayList;

public class TestSite implements Exportable {
	private ArrayList<CovidTest> tests;

	public void addTest (CovidTest t) {
		if(tests == null){
			tests = new ArrayList<CovidTest>();
		}
		
		tests.add(t);
	}
	
	public void runTests() {
		for (CovidTest t: tests) {
			t.setResult(Laboratory.doTest(t.getSampleId()));
		}
	}
	
	
	public String export() {
		if(tests == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		System.out.println(tests);
		for(CovidTest t: tests) {
			sb.append(t.export());
			sb.append("\n");
		}
		return sb.toString();
	}
}
