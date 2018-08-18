import java.util.*;
public class EnameComp implements Comparator {
	public int Compare(Object o1,Object o2)
	{
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return (e1.ename).compareTo(e2.ename);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
