package covid;

/**
 * The actual lab to do the tests based on IDs.
 */
public class Laboratory {
	
	/**
	 * evaluate a covid test based on the sample ID
	 *  
	 * @param sampleId ID of the sample to test for covid
	 * @return either Result.positive or Result.negative
	 */
	public static Result doTest(String sampleId) {
		return Result.values()[Math.abs(sampleId.hashCode()) % 3];
	}
}
