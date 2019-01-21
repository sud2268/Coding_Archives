import java.util.Scanner;

public class Lexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		lexography(0, n);
	}
	public static void lexography(int curr,int end) {
		//base case
		if(curr>end)
			return;
		
		//print current digit 
		
		System.out.print(curr+" ");
		
		//what to do in current state to print he number
		int i=0;
		if(curr==0)
			i=1;
		
		for(; i<=9; i++) {
			lexography(curr*10 +i, end);
		}
	}

}
