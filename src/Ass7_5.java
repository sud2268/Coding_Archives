
public class Ass7_5 {

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

				
				