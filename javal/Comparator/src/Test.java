import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(333,"ratan"));
		al.add(new Emp(222,"anu"));
		al.add(new Emp(111,"durga"));
		
		Collections.sort(al, new EidComp());
		for(Emp e:al)
		{
			System.out.println(e.eid+"="+e.ename);
		}
		// TODO Auto-generated method stub

	}

}
