
public class TowerOfHanoi {

	public static void main(String[] args) {
		 int n = 4; // Number of disks 
	        tower(n, 'A', 'C', 'B');  // A, B and C are names of rods 
	    
	}
	
	public static void tower(int n,char source, char destination,char auxillary) {
		if(n==1)
			System.out.println("move disk "+n+" from "+source+" to "+destination);
		else {
			tower(n-1,source,auxillary,destination);
			System.out.println("move disk "+n+" from "+source+" to "+destination);
			tower(n-1,auxillary,source,destination);
		}
			
	}
}
							