package covid;

public abstract class CovidTest implements Exportable {
	private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	public abstract String getSampleId();
	
	public String export() {
		StringBuilder sb = new StringBuilder();
		sb.append(getResult());
		sb.append(", ");
		sb.append(getSampleId());
		return sb.toString();
	}
}
