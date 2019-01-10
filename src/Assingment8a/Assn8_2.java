package Assingment8a;

import java.util.*;

public class Assn8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String a=ob.next();
		ArrayList<String> x=new ArrayList<String>();
		ascii("", a, x);
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
	}
	public static void ascii(String processed ,String unprocessed,ArrayList<String> list) {
		if(unprocessed.isEmpty()) {
			if(!processed.isEmpty()) {
				list.add(processed);
			}
			return ;
		}
		
		char ch=unprocessed.charAt(0);
		unprocessed=unprocessed.substring(1);
		int i=(int )ch;
		
		ascii(processed, unprocessed, list);
		
		ascii(processed+ch, unprocessed, list);
		
		ascii(processed+i, unprocessed, list);
		
	}
	

}
