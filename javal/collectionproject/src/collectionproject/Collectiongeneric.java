package collectionproject;
import java.util.*;
public class Collectiongeneric {

	public static void main(String[] args) {
		Emp e1= new Emp(121,"ratan");
		Emp e2= new Emp(122,"rak");
		Emp e3= new Emp(123,"raf");
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(Emp e:al)
			System.out.println(e.eid+" "+e.ename);
		// TODO Auto-generated method stub
	}

}
