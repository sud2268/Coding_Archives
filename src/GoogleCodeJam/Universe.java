package GoogleCodeJam;
import java.util.*;

public class Universe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int test=ob.nextInt();
		while(test-->0) {
			int d=ob.nextInt();
			ob.nextLine();
			String p=ob.nextLine();
			
			int damage=damage(p);
			int noOfHack=0;
			if(damage>d) {
				noOfHack=hacked(d, p);
			}else {
				noOfHack=0;
			}
			
			if(noOfHack<0) {
				System.out.println("IMPOSSIBLE");
			}else {
				System.out.println(noOfHack);
			}
		}
	}
	
	public static int damage(String p) {
		char ch[]=p.toCharArray();
		int damage=0,power=1;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='C') {
				power*=2;
			}else {
				damage+=power;
			}
		}
		return damage;
	}

	public static int hacked(int d,String p) {
		char ch[]=p.toCharArray();
		int damage=0 ,count=0;
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]=='C'&&ch[i+1]=='S') {
				ch[i+1]='C';
				ch[i]='S';
				count++;
				damage=damage(ch.toString());
				if(damage<=d) {
					break;
				}
			}
		}
		damage=damage(ch.toString());
		if(damage<=d) {
			return count;
		}else {
			return -1;
		}
	}
}
									