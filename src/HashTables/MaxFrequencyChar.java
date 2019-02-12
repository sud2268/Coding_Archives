package HashTables;
//to find maximum frequency of character in the line without counting the spaces

import java.util.*;

public class MaxFrequencyChar {

	public static void main(String[] args) {
		HashMap<Character, Integer> list=new HashMap<>();
		Scanner ob=new Scanner(System.in);
		String str=ob.nextLine();
		
		//convert array to string
		char a[]=str.toCharArray();
		
		for (char st : a) {
			
			//if the list does not contains the character add 1.
			if(!list.containsKey(st)) {
				list.put(st, 1);
			}else {
				list.put(st, list.get(st)+1);
			}

		}
		
		int max=0; 
		char max_char=' ';
		
		for (char c : a) {
			if(list.get(c)>max ) {
				//check if the character is space or not
				if (c!=' ') {
					max=list.get(c);
					max_char=c;
				}
				
			}
		}
		System.out.println("maximum frequency is for "+max_char+" and freq is"+max);
		System.out.println(list);
		System.out.println(list.get(' '));
		//System.out.println(list);
	}


}
