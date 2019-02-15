package HackerBlocksProblems;
/*Take as input str, a number in form of a string. Write a recursive function to 
convert the number in string form to number in integer form. */
import java.util.*;
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String a=ob.next();
		//int b=toInteger(a);
		System.out.println(toInteger(a,a.length()));
	}
	public static int toInteger(String s,int count) {
		//base case
		if(s.length()==0) {
			return 0;
		}
		int placeVal=1;
		for (int i = 1; i <count; i++) {
			placeVal*=10;
		}
		
		int ch=(int)(s.charAt(0)-48)*placeVal;
		int sum=ch+toInteger(s.substring(1),count-1);;
		//int ros=toInteger(s.substring(1),count-1);
		
		//int sum2=ch*10^(s.substring(1).length()-1)+ros;
		return sum;
	}
}
