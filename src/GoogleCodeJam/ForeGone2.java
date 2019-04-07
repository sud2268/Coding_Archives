package GoogleCodeJam;


import java.lang.Math;
import java.util.Scanner;
import java.io.*;

public class ForeGone2 {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long test=ob.nextLong();
		long i=0;
		while(i++<test) {
			long N=ob.nextLong();
			long A=sum(N);
			long B=N-A;
			System.out.println("Case #" + i + ": " + (A) + " " + (B));
		}
		//System.out.prlongln(checkFour(130));
		//System.out.prlongln(sum(940)+"\t"+(940-sum(940)));
	}
	
	public static long sum(long n) {
		long i=1;
		for ( i = 1; i < n/2; i++) {
			if(checkFour(i) && checkFour(n-i)) {
				break;
			}
		}
		return i;
	}
	
	public static boolean checkFour(long n) {
		while(n>0) {
			long d=n%10;
			if(d==4) {
				return false;
			}
			n/=10;
		}
		return true;
	}

}
