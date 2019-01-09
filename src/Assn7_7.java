import java.util.Scanner;

/*Take as input str, a string. Write a recursive function which moves all ‘x’ from the 
string to its end. E.g. for “abexexdexed” return “abeedeedxxx”. Print the value 
returned*/

public class Assn7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		String count1=count(s,0,0);
		
		System.out.println(count1);
	}

	public static String count(String s,int index,int sum) {
		if(index==s.length()) {
			//not returning value properly.......................
			for(int i=0;i<sum;i++)
				s+="x";
			System.out.println(s);
			return s;
		}
		
		
		if(s.charAt(index)=='x'||s.charAt(index)=='X') {
			s=count(s.substring(0, index)+s.substring(index+1), index,sum+1);
		
		}
		else
			s=count(s, index+1,sum);
		
		return s;
	}
}
