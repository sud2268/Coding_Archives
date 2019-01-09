import java.util.*;
/*Take as input str, a string. Write a recursive function which returns a new string in 
which all duplicate consecutive characters are separated by a ‘*’. E.g. for 
“hello” return “hel*lo”. Print the value returned*/

public class Assn7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		consecutive(s,0);
		
	}
	public static void consecutive(String s,int index) {
		if(index==s.length()-2) {
			System.out.println(s);
			return;
		}
		if(s.charAt(index)==s.charAt(index+1))
			consecutive(s.substring(0, index+1)+"*"+s.substring(index+1), index+1);
		else
			consecutive(s, index+1);
	}
}
