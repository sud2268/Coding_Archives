package HackerBlocksProblems;
import java.util.*;

public class SortedArray {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int arr[]=new int[n];
		int i=0;
		while(n-->0) {
			arr[i++]=ob.nextInt();
		}
		System.out.println(isSorted(arr));
	
	}
	
	private static boolean isSorted(int[] list) {
		int j=0;
		for(int i=1;i<list.length;i++) {
			if(list[j++] > list[i]) {
				return false;
			}
		}
		//System.out.println("completed");
		return true;
	}
}
