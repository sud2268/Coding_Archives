package Assingment8a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*Take as input str, a string. We are concerned with all possible permutations of
characters in str. E.g. “abc” can produce following words “abc”, “acb”, “bac”,
“bca”, “cab”, “cba”*/
public class Assn8a_4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		System.out.println(getPermutation(s));
	}
	public static ArrayList<String> getPermutation(String s){
		if(s.length()==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}

		char ch=s.charAt(0);
		ArrayList<String> rr=getPermutation(s.substring(1));

		ArrayList<String> mr=new ArrayList<>();
		for(String rrs:rr) {
			for (int i = 0; i <=rrs.length(); i++) {
				String val=rrs.substring(0, i)+ch+rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;

	}
}
