/*Take as input N, a number. Write a recursive function to find Nth triangle where
1 st triangle is 1, 2 nd triangle is 1 + 2 = 3, 3 rd triangle is 1 + 2 + 3 = 6, so on and so
forth. Print the value returned.*/

public class Ass6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3));
	}
	public static int sum(int n)
	{
		if(n==0)
			return 0;
		
		return n+sum(n-1);
		}
}

				
				