package HackerBlocksProblems;
//Sieve of Eratosthenes

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		System.out.println("the number is"+isPrime(a));
	}
	public static boolean isPrime(int n) {
		boolean a[]=new boolean[n+1];
		a[0]=a[1]=false;
		
		for (int i = 2; i < a.length; i++) {
			a[i]=true;
		}
		for(int i=2;i*i<=n;i++) {
			if(a[i]==true) {
				for(int j=i*i;j<=n;j+=i) {	
					a[j]=false;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]==true) {
				System.out.println(i+"\t"+a[i]);
			}
		}
		if(a[n]==true)
			return true;
		else
			return false;
		
	}
	

}
