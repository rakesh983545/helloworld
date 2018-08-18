
public class ITCompany {
	private ITCompany() {
		
	}
	String itcName="rakesh gig to technology";
	
	///factory method initialize
	
	public static ITCompany getObjectForITCompany() {
		return new ITCompany();
	}
	
	public static Employee getObjectForEmployee() {
		return new Employee();
	}

}
