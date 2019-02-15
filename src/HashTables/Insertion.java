package HashTables;
import java.util.*;
//to check if  

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int m=ob.nextInt();
		int n=ob.nextInt();

		int a[]=new int[m];
		int b[]=new int[n];
		
		for (int i = 0; i < a.length; i++) {
			 a[i]=ob.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			 b[i]=ob.nextInt();
		}
		
	}
	
	public static void insertion(int a[],int b[]) {
		HashMap<Integer, Boolean> list=new HashMap<>();
		for (int i : a) {
			list.put(i, false);
		}
		
		for (int i : b) {
			if(list.get(i)) {
				list.put(i, true);
				System.out.println(i);
			}
		}
		
		
	}

}
