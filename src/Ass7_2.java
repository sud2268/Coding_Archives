import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ass7_2 {
	public static void main(String[] args) {
		pattern2(7);
	}
	public static void pattern(int n) {
		if(n==1) {
			System.out.println("*"); 
			return;
		}
		for(int i=0;i<n;i++)
			System.out.print("*");
		
		System.out.println();
		
		pattern(n-1);
		//if(n==0)
			//return;
	}
	
	public static void pattern2(int n) {
		if(n==1) {
			System.out.println("*"); 
			return;
		}
		pattern2(n-1);
		for(int i=0;i<n;i++)
			System.out.print("*");
		
		System.out.println();
		
		
		//if(n==0)
			//return;
	}
	
	
}	
						