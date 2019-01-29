package HackerBlocksProblems;

import java.util.*;
public class Pattern {

	 public static void main(String args[]) {
	        Scanner ob=new Scanner(System.in);
	        int n=ob.nextInt();
	        pattern1(n);
	    }
	 
//     1           1
//     1 2       2 1  
//     1 2 3   3 2 1
//     1 2 3 4 3 2 1  
	 
	 public static void pattern1(int n) {
		 for (int i=1;i<=n ;i++ ) {
	            for (int j=1;j<2*n ;j++ ){
	                if(j<=i||j>=(2*n-i)){
	                    if(j<=n)
	                    System.out.print(j+"\t");
	                    else
	                    System.out.print(2*n-j+"\t");
	                }
	                else
	                    System.out.print("\t");
	            }
	            System.out.println();
	        }
	 }
	    

}
