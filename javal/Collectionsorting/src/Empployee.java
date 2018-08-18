import java.util.ArrayList;
import java.util.Collections;

public class Empployee {

	public static void main(String[] args) {
		 ArrayList<Collectionsorting> al=new ArrayList<Collectionsorting>();
		 al.add(new Collectionsorting(333,"ratan"));
		 al.add(new Collectionsorting(222,"anu"));
		 al.add(new Collectionsorting(111,"durga"));
		 //Collections.sort(al);
		 for(Collectionsorting e:al)
		 {
			 System.out.println(e.ToString());
		 }
		// TODO Auto-generated method stub

	}

}
