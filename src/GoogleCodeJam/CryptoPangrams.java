package GoogleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CryptoPangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sieveOfEratosthenes(103));
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test=ob.nextInt();
		int i=0;
		while(i++<test) {
			int N=ob.nextInt();
			int L=ob.nextInt();
			int ar[]=new int[L];
			for (int j = 0; j < ar.length; j++) {
				ar[j]=ob.nextInt();
			}
			for (int j = 0; j < ar.length; j++) {
				ar[j]=ob.nextInt();
			}
			int rs[]=divide(ar,N);
			
		}
	}
	
	
	
	public static int[] divide(int[] ar,int n) {
		//primes
		ArrayList<Integer> list =sieveOfEratosthenes(n);
		
		
		int initialdivisor=0;
		for (int i = 0; i < list.size(); i++) {
			if(ar[0]%list.get(i)==0) {
				System.out.println(ar[0]+" "+list.get(i));
				initialdivisor=list.get(i);
				break;
			}
		}
		System.out.println(initialdivisor);
		
		int []msg=new int[ar.length+1];
		msg[0]=initialdivisor;
		System.out.println(msg[0]);
		int j=0;
		for (int i = 0; i < ar.length; i++) {
			int d=ar[i]/msg[j];
			msg[++j]=d;
		}
		//System.out.println(msg);
		for (int i = 0; i < msg.length; i++) {
			System.out.println(msg[i]);
		}
		return msg;
		
	}
	
	public static ArrayList<Integer> sieveOfEratosthenes(int n) 
	    { 
	     
			ArrayList<Integer> list=new ArrayList<>();
	        boolean prime[] = new boolean[n+1]; 
	        for(int i=0;i<n;i++) 
	            prime[i] = true;
	          
	        for(int p = 2; p*p <=n; p++) 
	        { 
	            if(prime[p] == true) 
	            { 
	                for(int i = p*p; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	          
	        // Print all prime numbers 
	        for(int i = 2; i <= n; i++) 
	        { 
	            if(prime[i] == true) {
	              //  System.out.print(i + " "); 
	                list.add(i);
	            }
	        }
	        return list;
	    } 

}
