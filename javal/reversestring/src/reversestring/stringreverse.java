package reversestring;
//import java.util.*;
public class stringreverse {
	

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}
