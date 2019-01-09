import java.util.*;
/*Take as input N, the size of array. Take N more inputs and store that in an array.
Write a recursive function which bubble sorts the given array.
Print all the values in the sorted array.*/
public class Assn6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		bubblerecursive(a, 0);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void bubble(int a[])
	{
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
	}
	
	public static void bubblerecursive(int a[],int index) {
		if(index==a.length) {
			return;
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}				
		}
		
		bubblerecursive(a, index+1);
	}
	
/*	public static void bubblerecursive2(int a[],int index) {
		if(index==a.length) {
			return;
		}
		if(a[])
		bubblerecursive2(a, index+1);			
		}
		
	
	public static void swap(int a,int i) {
		if(i<a)
	}*/
}
