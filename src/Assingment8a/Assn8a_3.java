package Assingment8a;
/*Take as input str, a string. str represents keys pressed on a nokia phone keypad.
We are concerned with all possible words that can be written with the pressed
keys. E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”,
“cd”, “ce”, “cf”
a. Write a recursive function which returns the count of words for a given
keypad string. Print the value returned.
b. Write a recursive function which returns an ArrayList of words for a given
keypad string. Print the value returned.
c. Write a recursive function which prints all possible words for a given
keypad string (void is the return type for function).*/

import java.util.*;

public class Assn8a_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String a=ob.next();
		ArrayList<String> arr=new ArrayList<>();
		arr=subOfInt(a,"");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
//		int z=Integer.parseInt(a.substring(0,1));
//		System.out.println(z);
//		char ch=(char)(z-1+'a');
//		System.out.println(ch);
		
		//**IMPORTANT TO CONVERT INTEGER STRING INTO  CHARACTER***/
	}
	
	public static ArrayList<String> subOfInt(String unp,String pr) {
		
		if(unp.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			if(!pr.isEmpty()) {
				list.add(pr);
			}	
			return list;
		}
		
		int z=Integer.parseInt(unp.substring(0, 1));
		unp=unp.substring(1);
		ArrayList<String> list=new ArrayList<>();
		for (int i = 3*(z-1); i < 3*z ; i++) {
			
			char ch=(char)(i+'a');
			list.addAll(subOfInt(unp, pr+ch));
		}
		return list;
	}
}
