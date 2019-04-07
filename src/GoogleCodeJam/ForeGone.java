package GoogleCodeJam;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class ForeGone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test=ob.nextInt();
		int i=0;
		while(i++<test) {
			int N=ob.nextInt();
			HashMap<Integer, Boolean> map=map(N);
			
			int A=check(map);
			int B=N-A;
			System.out.println("Case #" + i + ": " + (A) + " " + (B));
		}
		//System.out.println(checkFour(130));
		//System.out.println(sum(940)+"\t"+(940-sum(940)));
	}
//	
//	public static int sum(int n) {
//		int i=1;
//		for ( i = 1; i < n; i++) {
//			if(checkFour(i) && checkFour(n-i)) {
//				break;
//			}
//		}
//		return i;
//	}
//	
	public static int check(HashMap<Integer, Boolean> map) {
		int i=1;
		for( i=1;i<map.size();i++) {
			if(map.get(i)&& map.get(map.size()-i)) {
				break;
			}
		}
		return i;
	}
	
	public static boolean checkFour(int n) {
		while(n>0) {
			int d=n%10;
			if(d==4) {
				return false;
			}
			n/=10;
		}
		return true;
	}
		public static HashMap<Integer, Boolean> map(int n) {
			HashMap<Integer, Boolean> map=new HashMap<>();
			for (int i = 1; i < n; i++) {
				map.put(i, false);
			}
			
			for (int i = 1; i < n; i++) {
				if(checkFour(i)) {
					map.put(i, true);
				}

			}
			return map;
		}
}
