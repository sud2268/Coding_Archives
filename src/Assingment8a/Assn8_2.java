package Assingment8a;

import java.util.*;

public class Assn8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String a=ob.next();
		ArrayList<String> x=new ArrayList<String>();
		x.add("");
		ascii("", a, x);
		//int z=countascii("", a, x, 0);
		System.out.println(x.size());
		for (int i = 0; i < x.size(); i++) {
			System.out.print(x.get(i)+" ");
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
	
/*	public static int countascii(String processed ,String unprocessed,ArrayList<String> list,int count) {
		if(unprocessed.isEmpty()) {
			if(!processed.isEmpty()) {
				list.add(processed);
			}
			return ++count;
		}
		
		char ch=unprocessed.charAt(0);
		unprocessed=unprocessed.substring(1);
		int i=(int )ch;
		
		count=countascii(processed, unprocessed, list,count);
		
		count=countascii(processed+ch, unprocessed, list,count);
		
		count=countascii(processed+i, unprocessed, list,count);
		
		return count;
		
		
	}
*/
}
			