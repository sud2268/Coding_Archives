import java.util.Scanner;

public class Assn7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		System.out.println(twin(s,0));
	}
	public static int twin(String s,int sum) {
		if(s.length()<=2)
			return sum;
		if(s.charAt(0)==s.charAt(2)) {
			sum=twin(s.substring(1),sum+1);
			
		}else
			sum=twin(s.substring(1), sum);
			
		return sum;
	}
}
					