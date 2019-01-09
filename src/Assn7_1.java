import java.util.*;
/*Take as input str, a number in form of a string. Write a recursive function to find 
the sum of digits in the string. Print the value returned.*/

public class Assn7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String x=ob.next();
		char y[]=x.toCharArray();
		System.out.println(sumofDigits(y,0));
		//int z=y[0]-'0';
		//System.out.println(z+2);
	}
	public static int sumofDigits(char a[],int index) {
		if(index==a.length) {
			return 0;
		}
		int x=a[index]-'0';
		//System.out.println(x);
		return( x+sumofDigits(a,index+1));
	}
}
			