import java.util.Scanner;
/*Take as input N, the size of array. Take N more inputs and store that in an array.
Write a recursive function which selection sorts the given array. 
Print all the values 
in the sorted array
*/
public class Assn6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		selectionRecursive(a,0);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void selectionRecursive(int a[],int index)
	{
		if(index==a.length-1) {
			return;
		}
		
		int min=index;
		for(int i= index+1;i<a.length;i++) {
			if(a[i]<a[min])
				min=i;
			
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		selectionRecursive(a, index+1);
	}

}
