package GFG;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0) {
			int n=ob.nextInt();
			int operations=0;
			while(n>1) {

				if(n%2==0) {
					n/=2;
					operations++;
				}
				else {
					n-=1;
					operations++;
				}
			}
			System.out.println(operations);
		}
		
	}
	public static void oper(int n,int op) {
		if(n==1) {
			System.out.println(op);
		}
		if(n%2==0) {
			n/=2;
			oper(n, op);
		}
		else {
			n+=1;
			oper(n, op);
		}
	}
}
