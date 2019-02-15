package HackerBlocksProblems;
/*
Write a function that returns its inverse, where inverse is defined as follows

Inverse of 32145 is 12543.
In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place;
in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.*/

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		System.out.println(inverse(a,1));
		
	}
	public static int inverse(int pr,int pos) {
		if(pr==0) {
			return 0;
		}
		int a=pr%10;
		pr=pr/10;
		int placeval=pos*(int)Math.pow(10, a-1);
		int inv=placeval+ inverse(pr, pos+1);
		return inv;
		
		
	}

}
