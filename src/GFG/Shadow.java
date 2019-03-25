package GFG;
import java.util.*;
public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0) {
			int size=ob.nextInt();
			int ar[]=new int[size];
			//HashMap<Integer	, Integer> map=new HashMap<>();
			for (int i = 0; i < ar.length; i++) {
				ar[i]=ob.nextInt();
				
			}
			
			int missing=0,repeat=0;
			for (int i = 0; i < ar.length; i++) {
				
				//System.out.println((i+1)+" ar="+ar[i]);
				if((i+1)!=ar[i]) {
					missing=i+1;
					//System.out.println("true"+missing);
					break;
				}
			}
			
//			for (int i = 0; i < ar.length; i++) {
//				for (int j = i+1; j < ar.length; j++) {
//					if(ar[i]==ar[j]) {
//						repeat=ar[i];
//						break;
//					}
//				}
//			}
			
			Arrays.sort(ar);
			for (int i = 0; i < ar.length-1; i++) {
				if(ar[i]==ar[i+1]) {
					repeat=ar[i];
				}
			}
			System.out.println(repeat+" "+missing);
		}
	}

}
