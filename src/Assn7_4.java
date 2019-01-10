import java.util.Scanner;

/*Take as input str, a string. Write a function which tests if the string is a palindrome
or not and returns a Boolean value. Print the value returned.
*/
public class Assn7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String str1=ob.next();
		System.out.println(pallindrome(str1));
	}
	public static boolean pallindrome(String s) {
		
		if(s.length()==0)
			return true;
		else {
			if(s.charAt(0)==s.charAt(s.length()-1))
				pallindrome(s.substring(1, s.length()-2));
			else
				return false;
			return true;
		}
	}

}
