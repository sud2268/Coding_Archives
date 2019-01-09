import java.util.Scanner;
/*Take as input N, a number. Take N more inputs and store that in an array. Write a 
recursive function which reverses the array. Print the values of reversed array.*/
public class Assn6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		reverse(a, 0);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static void reverse(int a[],int index) {
		if(index == a.length/2+1) {
			return;
		}
		int temp=a[index];
		a[index]=a[a.length-index-1];
		a[a.length-index-1]=temp;

		reverse(a,index+1);

	}


}
