package covid;

public class CovidSwabTest extends CovidTest {
	private String swabId;
	
	public CovidSwabTest(String swabId) {
		this.swabId = swabId;
	} 
	
	@Override
	public String getSampleId() {
		return swabId;
	}
}
