/*
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1  */


public class Ass6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5,0);
		//permute();
		//System.out.println(fact(5));
	}
	public static void pattern(int n,int temp) {
		if(temp==n+1)
		{

			return;
		}
		for(int j=0;j<=temp;j++)
			System.out.print(" "+permute(temp,j));
		System.out.println();
		pattern(n,temp+1);
		
		
	}
	public static int permute(int n,int i) {
		int per=fact(n)/(fact(n-i)*fact(i));
		return per;
	}
	
	public static int fact(int n) {
		int fac=1;
		if(n==0||n==1)
			return 1;
		else {
		for(int i=1;i<=n;i++)
			fac=fac*i;
		return fac;
		}
	}
}

					