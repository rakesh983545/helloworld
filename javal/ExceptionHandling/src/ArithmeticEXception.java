
public class ArithmeticEXception {

	public static void main(String[] args) {
		
		int d;
		int a;
		try
		{
			
			d=0;
			a=10/d;
			System.out.println("THis will not be printed");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch method came beacuse exception is occureed in try block");
		}
		System.out.println("outside the catch block");
		// TODO Auto-generated method stub

	}

}
