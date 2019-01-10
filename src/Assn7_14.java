import java.util.Scanner;
/*Take as input str, a string. The string contains a single pair of parenthesis “(..)”.
Write a recursive function which returns the contents between the parenthesis.
E.g. for “xyz(abc)def” return “abc”. Print the value returned.*/

public class Assn7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		praenthesis(s, "");
	}
	public static void praenthesis(String s,String sub) {
		if(s.charAt(1)==')') {
			System.out.println(sub);
			return;
		}
		if(s.charAt(0)=='(')
			praenthesis(s.charAt(0)+s.substring(2), sub+s.charAt(1));
		else
			praenthesis(s.substring(1), sub);
	}

}
