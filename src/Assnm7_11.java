import java.util.*;
public class Assnm7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		System.out.println(aaaCount2(s, 0));
	}
	public static int aaaCount(String s,int sum) {
		if(s.length()<3)
			return sum;
		if(s.substring(0, 3).equals("aaa"))
			sum=aaaCount(s.substring(1), sum+1);
		
		return sum;
	}

	public static int aaaCount2(String s,int sum) {
		if(s.length()<3)
			return sum;
		if(s.substring(0, 3).equals("aaa"))
			sum=aaaCount(s.substring(3), sum+1);
		
		return sum;
	}
}
