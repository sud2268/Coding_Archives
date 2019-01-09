import java.util.ArrayList;
import java.util.Scanner;

public class Assn6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		
		int m=ob.nextInt();
		ArrayList<Integer>arr= search(a,0,m);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
	
	public static ArrayList<Integer> search(int a[],int index,int m) {
		//ArrayList<Integer> arr=new ArrayList<Integer>();
		if(index==0)
			return null ;
		if(a[index]==m)
			arr.add(index);
		
		a.
		search(a, index+1, m, list);
		
		
		return list;
	}
	
}
	