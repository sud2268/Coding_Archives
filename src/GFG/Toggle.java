package GFG;
import java.lang.Math;
import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0) {
			int n=ob.nextInt();
			String binary=Integer.toBinaryString(n);
			char ch[]=binary.toCharArray();
			System.out.println(ch);
			int b=Integer.parseInt(binary);
			
			
			if(binary.length()%2==0) {
				int mid=binary.length()/2;
				System.out.println(mid+" ch="+ch[mid]);
				if(ch[mid-1]=='0') {
					ch[mid-1]='1';
				}else {
					ch[mid-1]='0';
				}
				
				if(ch[mid]=='0') {
					ch[mid]='1';
				}else {
					ch[mid]='0';
				}
				System.out.println(ch);
			}
			else {
				int mid=binary.length()/2;
				System.out.println(mid+" ch="+ch[mid]);

				if(ch[mid-1]=='0') {
					ch[mid-1]='1';
				}else {
					ch[mid-1]='0';
				}
				System.out.println(ch);

			}
			System.out.println(ch);
		}


	}
	
}
