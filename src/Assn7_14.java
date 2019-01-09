import java.util.Scanner;

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
