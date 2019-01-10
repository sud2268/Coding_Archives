/**
 * Take as input str1 and str2, both strings. Write a function which tests if str2 is
reverse of str1 or not and returns a Boolean value. Print the value returned.
 */

/**
 * @author sud

 *
 */
import java.util.*;
public class Assn7_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String str1=ob.next();
		String str2=ob.next();
		System.out.println(reverse(str1, str2, 0));
	}

	public static boolean reverse(String str1,String str2,int index) {
		//if(str1.length()!=str2.length())
		//	return false;
		
		if(index==str1.length()) { 
			//System.out.println("true");
			return true;
		}
		else {
			System.out.println(str1.charAt(index)+"  "+str2.charAt(str2.length()-index-1));

			if(str1.charAt(index)==str2.charAt(str2.length()-index-1)) 
				reverse(str1, str2, index+1);
			else
				return false;

			return true;
		}
	}
}
