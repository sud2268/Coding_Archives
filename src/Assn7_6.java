import java.util.*;
/*Take as input str, a string. Write a recursive function which returns a new string in 
which all duplicate consecutive characters are reduced to a single char. E.g. for 
“hello” return “helo”. Print the value returned.*/
public class Assn7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		repeatDelete(s,0);
	}
	public static void repeatDelete(String s,int index) {
		if(index==s.length()-2)
		{
			System.out.println(s);
			return;
		}
		if(s.charAt(index)==s.charAt(+1))
			repeatDelete(s.substring(0, index+1)+s.substring(index+2), index+1);
		else
			repeatDelete(s, index+1);
	}
}
