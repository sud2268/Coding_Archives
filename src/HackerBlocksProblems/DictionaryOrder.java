package HackerBlocksProblems;

import java.util.*;

public class DictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		//dictOrders(s);
		//System.out.println();
		dictGreater(s);
	}
	public static void dictOrders(String s) {
		ArrayList<String>list=dictOrder(s, "", new ArrayList<>());
		//System.out.println(list);
		list.sort(null);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static void dictGreater(String s) {
		ArrayList<String>list=dictOrder(s, "", new ArrayList<>());
		list.sort(null);
		for (String string : list) {
			if(string.compareTo(s)<0)
			System.out.println(string);
		}
	}
	
	private static ArrayList<String> dictOrder(String unp,String pr,ArrayList<String>list) {
		
		if(unp.length()==0) {
			//System.out.println(pr);
			list.add(pr);
			
		}
		
		for (int i = 0; i < unp.length(); i++) {
			
			char ch=unp.charAt(i);
			String roq=unp.substring(0, i)+unp.substring(i+1);
			
			dictOrder(roq, pr+ch,list);
			
		}
		
		//System.out.println(list);
		return list;
	}
}
			