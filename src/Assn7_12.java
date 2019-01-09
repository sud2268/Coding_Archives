import java.util.Scanner;

//VERY IMPORTANT

/*Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26. Write
a recursive function (return type void) to print all possible codes for the string. E.g.
for “1123” possible codes are aabc, kbc, alc, aaw, kw*/

public class Assn7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
//		int x=Integer.parseInt(s.substring(0));
//		char c=(char)(x-1+'a');
//		System.out.println(c);
		codes("", s);
	}
	
	public static void codes(String processed ,String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		
		if(unprocessed.length()>=2) {
			int num=Integer.parseInt(unprocessed.substring(0, 2));
			//int num2=Integer.parseInt(unprocessed.substring(0, 1));
			if(num<=26)
			codes(processed+(char)(num-1+'a'), unprocessed.substring(2));
			//codes(processed+(char)(num2-1+'a'), unprocessed.substring(1));
		}
		
			int num2=Integer.parseInt(unprocessed.substring(0, 1));
			codes(processed+(char)(num2-1+'a'), unprocessed.substring(1));

		
	}

}
