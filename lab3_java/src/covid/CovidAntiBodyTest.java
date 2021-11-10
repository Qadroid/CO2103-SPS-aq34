package covid;

public class CovidAntiBodyTest extends CovidTest {
	private String bloodSampleId;
	
	public CovidAntiBodyTest(String bloodSampleId) {
		this.bloodSampleId = bloodSampleId;
	}
	
	@Override
	public String getSampleId() {
		return bloodSampleId;
	}
}
