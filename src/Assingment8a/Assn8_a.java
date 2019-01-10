package Assingment8a;

import java.util.ArrayList;
import java.util.Scanner;

/*1. Take as input str, a string. We are concerned with all the possible subsequences
of str. E.g. “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”,
“bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.
a. Write a recursive function which returns the count of subsequences for a
given string. Print the value returned.
b. Write a recursive function which returns an ArrayList of subsequences for a
given string. Print the value returned.
c. Write a recursive function which prints all possible subsequences for a
given string (void is the return type for function*/
public class Assn8_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		ArrayList<String > arr =new ArrayList<String>();
		subSequence("", s,arr );
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	public static void subSequence(String processed,String unprocessed ,ArrayList<String> list)
	{
		if(unprocessed.isEmpty()) {
			
			if(!processed.isEmpty()) {
				list.add(processed);
			}
			return;
		}
		
		char first=unprocessed.charAt(0);
		unprocessed=unprocessed.substring(1);
		
		subSequence(processed, unprocessed, list);
		subSequence(processed+first, unprocessed, list);
		
	}

}
