import java.util.*;
/*Take as input str, a number in form of a string. Write a recursive function to 
convert the number in string form to number in integer form. */
public class Assn7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String x=ob.next();
		//String x="121";
		System.out.println(toInteger(x));
		
	}
	public static int toInteger(String s) {
		if(s.length()==1)
			return s.charAt(0)-'0' ;
		int x=s.charAt(0)-'0';
		int sum =x*10+toInteger(s.substring(1));
		return sum;
	}
}
