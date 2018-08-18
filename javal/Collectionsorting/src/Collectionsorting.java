import java.util.*;
public class Collectionsorting implements Comparable{
	// public static final String Collectionsorting = null;
	int eid;
	 String ename;
	 Collectionsorting(int eid,String name)
	 {
		 this.eid=eid;
		 this.ename=ename;
	 }
	 public int compareTo(Object o)
	 {
		 Collectionsorting c=(Collectionsorting)o;
		 if(eid==c.eid)
		 {return 0;}
		 else if(eid>c.eid)
		 {return 1;}
		 else
			 return -1;
	 }
	 public String ToString()
	 {
		 return eid+" "+ename;
	 }
} 
