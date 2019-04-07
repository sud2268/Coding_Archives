package GoogleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Maze2 {
	public static void main(String[] args) {
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test=ob.nextInt();
		int i=0;
		while(i++<test) {
			int N=ob.nextInt();
			ob.nextLine();
			String P=ob.nextLine();
			String s=Swap(P);
			System.out.println("Case #" + i + ": " + (s) );
		}
	}
		public static String Swap(String p) {
			char ch[]=p.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]=='S') {
					ch[i]='E';
				}else {
					ch[i]='S';
				}
			}
			String s=String.valueOf(ch);
			//System.out.println(s);
			return s;
		}
}
