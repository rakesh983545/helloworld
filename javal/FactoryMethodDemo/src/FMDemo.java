
public class FMDemo {

	public static void main(String[] args) {
		
ITCompany itc=ITCompany.getObjectForITCompany();
//System.out.println(itc.itcName);
System.out.println(itc.itcName);


Employee e=ITCompany.getObjectForEmployee();
System.out.println(e.empName);
	}

}
