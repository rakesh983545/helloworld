import java.util.*;

public class Comparator2 implements Comparator<String>{
	public int compare(String a,String b)
	{
		String astr,bstr;
		astr=a;
		bstr=b;
		return bstr.compareTo(astr);
	}

	}
