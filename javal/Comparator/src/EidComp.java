
import java.util.*;
public class EidComp implements Comparator{
	public int Compare(Object o1,Object o2)
	{
		Emp e1=(Emp) o1;
		Emp e2=(Emp) o2;
		if(e1.eid==e2.eid)
		{
			return 0;
		}
		else if(e1.eid>e2.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
