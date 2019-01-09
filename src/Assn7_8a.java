import java.util.Scanner;

import javax.security.auth.Subject;
/*a. Write a recursive function which counts the number of times ‘hi’ appears 
in the string. Print the value returned.
b.  Write a recursive function which removes all ‘hi’ in the string. Print the 
value returned.
c.  Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. 
Print the value returned*/

public class Assn7_8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		System.out.println(hiCount(s,0));
		System.out.println(hiremove(s));
		System.out.println(hiBye(s));
	}
	public static int hiCount(String s,int sum)
	{
		if(s.length()==0)
			return sum;
		if(s.charAt(0)=='h'&& s.charAt(1)=='i') {
			
			sum=hiCount(s.substring(1), sum+1);
		}
		else
			sum=hiCount(s.substring(1), sum);
		
		return sum;
			
	}
	public static String hiremove(String s)
	{
		if(s.length()==0)
			return "";
		if(s.charAt(0)=='h'&& s.charAt(1)=='i') {
			
			s=hiremove(s.substring(2));
		}
		else
			s=s.substring(0, 1)+hiremove(s.substring(1));
		
		return s;
			
	}
	public static String hiBye(String s) {
		if(s.length()==0)
			return "";
		
		if(s.charAt(0)=='h'&&s.charAt(1)=='i')
			s="bye"+hiBye(s.substring(2));
		else {
			s=s.substring(0, 1)+hiBye(s.substring(1));
			
		}
		return s;
	}
}
						