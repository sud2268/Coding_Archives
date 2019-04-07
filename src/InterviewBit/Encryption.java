package InterviewBit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a=ob.nextInt();
		ob.nextLine();
		String A=ob.nextLine();
		String s=solve(A,a);
		System.out.println(s);
	}

	public static String solve(String A,int B) {
		if(B>26) {
			B=B%26;
		}
		System.out.println(B);
		
		char ch[]=A.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		//System.out.println(map);
		
		for (int i = 0; i < ch.length; i++) {
			if(map.get(ch[i])%2==0) {
				int a=B;
				char cha=ch[i];
				if((cha+a)>122) {
					 cha=(char)(cha+a-26);
				}else {
					 cha=(char)(cha+a);
				}
				ch[i]=cha;
			}
			else {
				int a=B;
				char cha=ch[i];
				if((cha-a)<97) {
					 cha=(char)(cha-a+26);
				}else {
					 cha=(char)(cha-a);
				}
				ch[i]=cha;

			}
		}
		
		//System.out.println(ch);
		String rs=String.valueOf(ch);
		
		return  rs;
	}
}
