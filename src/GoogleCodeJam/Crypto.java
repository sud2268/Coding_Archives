package GoogleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;

public class Crypto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test=ob.nextInt();
		int i=0;
		while(i++<test) {
			int N=ob.nextInt();
			int L=ob.nextInt();
			//Array
			int [] ar=new int[L];
			//Ar inp
			for (int j = 0; j < ar.length; j++) {
				ar[j]=ob.nextInt();
			}
			/*for (int j = 0; j < ar.length; j++) {
				System.out.println(ar[j]);
			}*/

			String rs=Decipher(ar,N);
			System.out.println("Case #" + i + ": " + (rs) );

		}
	}

	public static String Decipher(int ar[], int N) {

		ArrayList<Integer> primeList=sieveOfEratosthenes(N);
		//get first no to divide the array
		int initial =initial(primeList,ar);
		//		System.out.println(initial);

		int []msg=decode(ar,initial);
		//sorting the msg
		Arrays.sort(msg);
		
		HashMap<Integer, Integer> map=decryption(msg);

		msg=decode(ar,initial);
		int rs[]=new int[msg.length];
		for (int i = 0; i < msg.length; i++) {
				rs[i]=map.get(msg[i]);
		}
		
		/*System.out.println(map);
		for (int i = 0; i < msg.length; i++) {
			System.out.print(rs[i]);
		}*/
		
		String result=convert(rs);

		return result;
	}
	
	public static String convert(int rs[]) {
		char ar[]=new char[rs.length];
		for (int i = 0; i < rs.length; i++) {
			ar[i]=(char)('A'+rs[i]-1);
		}
		return String.valueOf(ar);
	}

	public static HashMap<Integer, Integer> decryption(int[] msg) {
		int min=msg[0];
		int max=msg[msg.length-1],value=1;

		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < msg.length; i++) {
			if(!map.containsKey(msg[i])) {
				map.put(msg[i], value++);
			}
		}

		
		
		return map;
	}

	public static int[] decode(int ar[],int initial) {
		int msg[]=new int[ar.length+1];
		msg[0]=initial;
		for (int i = 0; i < ar.length; i++) {
			int div=ar[i]/msg[i];
			msg[i+1]=div;
		}
		/*for (int i = 0; i < msg.length; i++) {
			System.out.println(msg[i]);
		}*/


		return msg;
	}


	public static int initial(ArrayList<Integer> primeList,int[] ar) {
		for (int i = 0; i < primeList.size(); i++) {
			if(ar[0]%primeList.get(i)==0) {
				return primeList.get(i);
			}
		}
		return -1;
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
