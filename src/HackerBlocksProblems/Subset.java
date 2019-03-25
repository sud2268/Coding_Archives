package HackerBlocksProblems;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=ob.nextInt();
		}
		int k=ob.nextInt();

		subset(ar,k);

	}
	public static void subset(int ar[],int k) {
		subset(ar, 0, k,"",0);
	}
	private static void subset(int ar[],int pos,int k,String s,int sum ) {
		
		//base case
		if(sum==k) {
			System.out.println(s);
		}
//		if(sum>k) {
//			return;
//		}
		
		//loop over array
		for (int i = pos; i < ar.length; i++) {
			//recursive add digits to check if smaller than sum
			sum+=ar[i];
			if(sum<k) {
				//System.out.println(s);
				subset(ar, pos+1, k, s+" "+i, sum);
			}
			sum-=ar[i];

			
		}
		
	}

}
