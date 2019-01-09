import java.util.*;

/*Take as input N, a number. Take N more inputs and store that in a
n array. Write a recursive function which tests if the array is a palindrome and returns a Boolean 
value. Print the value returned.
*/
public class Assn7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		if(pallindrome(a,0))
			System.out.println("the number is pallindrome ");
		else
			System.out.println("the number is not pallindrome ");
	}
	public static boolean pallindrome(int a[],int index) {
		if(index==a.length/2+1) {
			System.out.println("the number is pallindrome ");
			return true;
		}
			
		
		if(a[index]==a[a.length-index-1])
			pallindrome(a, index+1);
		//if(a[index]!=a[a.length-index-1])
			
		return false;
	}
}
