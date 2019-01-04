
public class DEcimaltoBinary {
	public static void main(String[] args) {
		int x=11;
		int decimal=convert(x, 0);
		System.out.println(decimal);
	}
	public static int convert(int n,int index) {
		if(n/10==0)
			return (n%10*2^index);
		else 
			return ((n%10*2^index)+ convert(n/10,index+1));
		
	}
}
		  