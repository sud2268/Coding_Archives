package patterns;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
	//	int n=ob.nextInt();


		//		pattern1(n);
		//		pattern2(n);
		//		pattern3(n);
		//		pattern4(n);
		//	    hollowRhombus(n);
		//		rhombus(n);
		//		valley(n);
		//      pattern5(n);
		//  	hourglass(n);
		int m=ob.nextInt();
		int n1=ob.nextInt();
		int [][]ar=new int[m][n1];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j]=ob.nextInt();
			}
		}
		//wavePattern(ar);
		spiralPattern(ar);
	}
	public static void pattern1(int n) {
		int row=1;
		int nst=n;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;

			}
			System.out.println();
			nst-=1;
			row+=1;


		}
	}

	public static void pattern2(int n) {
		int row=2;
		int nst=2;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;

			}
			System.out.println();
			nst+=1;
			row+=1;


		}


	}

	public static void pattern3(int n) {
		int row=1;
		int nst=1;
		int tns=n;
		while(row<=n) {
			int cst=1,cns=1;
			while(cns<tns) {
				System.out.print(" ");
				cns++;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;

			}
			System.out.println();
			nst+=1;
			row+=1;
			tns-=1;


		}
	}

	//	5
	//	*
	//	**
	//	***
	//	****
	//	*****
	//	****
	//	***
	//	**
	//	*

	public static void pattern4(int n) {
		int nst=1,row=1;//row
		int nr=2*n-1;
		while(row<=nr) {
			//work in this iteration
			int cst=1;
			while(cst<=nst) {

				System.out.print("*");
				cst++;
			}
			//preparation for next row
			System.out.println();

			if(row<=nr/2)
				nst++;
			else
				nst--;

			row++;
		}

	}

	//	9
	//	**** ****
	//	***   ***
	//	**     **
	//	*       *
	//	         
	//	*       *
	//	**     **
	//	***   ***
	//	**** ****

	public static void hollowRhombus(int n) {
		int nst=n/2,nsp=1,row=1;
		while(row<=n) {
			int cst=1;
			//work
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}


			//preparation for next
			System.out.println();
			if(row<=n/2) {
				nst--;
				nsp+=2;
			}
			else {
				nst++;
				nsp-=2;
			}
			row++;
		}
	}

	//	7
	//	   *   
	//	  ***  
	//	 ***** 
	//	*******
	//	 ***** 
	//	  ***  
	//	   *   

	public static void rhombus(int n) {
		//row
		int row=1,nst=1,nsp=n/2;

		//work
		while(row<=n) {
			int cst=1,csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}

			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}


			//prreparation
			System.out.println();
			if(row<=n/2) {
				nst+=2;
				nsp--;
			}
			else {
				nst-=2;
				nsp++;
			}
			row++;
		}
	}

	//	5
	//	*       *
	//	**     **
	//	***   ***
	//	**** ****
	//	*********

	public static void valley(int n) {
		int nr=n;
		int row=1,nst=1,nsp=2*n-3;
		//work
		while(row<=nr) {
			int cst=1,csp=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			if(row==n) {
				cst=2;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//preparation for next line
			System.out.println();
			nsp-=2;
			nst++;
			row++;
		}

	}
	//
	//    * * * * *
	//    * *   * *
	//    *       *
	//    * *   * *
	//    * * * * *

	public static void holow(int n){
		int row=1,nst=n/2+1,nsp=-1;
		while(row<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print("*\t");
				cst++;
			}
			int csp=1;
			while(csp<=nsp){
				System.out.print(" \t");
				csp++;
			}

			cst=1;
			if(row==1||row==n){
				cst=2;
			}
			while(cst<=nst){
				System.out.print("*\t");
				cst++;
			}

			System.out.println();
			if(row<=n/2){
				nst--;
				nsp+=2;
			}
			else{
				nst++;
				nsp-=2;
			}
			row++;
		}
	}


	/*	3
	 	1	
	2	3	2	
3	4	5	4	3	
	 */

	public static void pattern5(int n) {
		int row=1,nst=1,nsp=n-1,count=1;

		while(row<=n) {
			int cst=1,csp=1;
			count=row;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp++;
			}

			while(cst<=nst) {				
				System.out.print(count+"\t");
				if(cst<=nst/2)
					count++;
				else
					count--;

				cst++;
			}
			System.out.println();
			nst+=2;		
			nsp--;
			row++;

		}
	}
	//	
	//	5
	//	5 4 3 2 1 0 1 2 3 4 5 
	//	  4 3 2 1 0 1 2 3 4 
	//	    3 2 1 0 1 2 3 
	//	      2 1 0 1 2 
	//	        1 0 1 
	//	          0 
	//	        1 0 1 
	//	      2 1 0 1 2 
	//	    3 2 1 0 1 2 3 
	//	  4 3 2 1 0 1 2 3 4 
	//	5 4 3 2 1 0 1 2 3 4 5 


	
	public static void hourglass(int n) {
		int nr=2*n+1, nst=2*n+1,nsp=0,val=n;
		int row=1;
		while(row<=nr) {
			val=nst/2;
			for (int csp = 1;csp <= nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1;cst <= nst; cst++) {
				System.out.print(val+" ");
				if(cst<=nst/2) {
					val--;
				}
				else {
					val++;
				}
			}


			//prep
			System.out.println();
			if(row<=nr/2) {
				nst-=2;
				nsp++;
			}
			else {
				nst+=2;
				nsp--;
			}
			row++;

		}
	}
//print matrix in wave format
	
	public static void wavePattern(int [][]ar) {
			
		
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < ar[i].length; j++) {
					System.out.println(ar[i][j]);
				}
			}
			else {
				for (int j = ar[i].length-1; j >=0 ; j--) {
					System.out.println(ar[i][j]);
				}
			}
		}
	}
	
	
	
	public static void spiralPattern(int a[][]) {
		
		int top=0,bottom=a.length-1,left=0,right=a.length-1,count=(bottom+1)*(right+1),direction=1;
		while(left<=right&&top<=bottom) {
			if(count >0) {
				if(direction==1) {
					for (int i = left; i <= right; i++) {
						System.out.print(a[top][i]+", ");
						count--;
					}
					top++;
					direction=2;
					
				}
				if(direction==2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(a[i][right]+", ");
						count--;
					}
					right--;
					direction=3;

					
				}
				if(direction==3) {
					for (int i = right; i >=left; i--) {
						System.out.print(a[bottom][i]+", ");
						count--;
					}
					bottom--;
					direction=4;

				}
				if(direction==4) {
					for (int i = bottom; i >=top ; i--) {
						System.out.print(a[i][left]+", ");
						count--;
					}
					left++;
					direction=1;

				}
				
			}
		}
		System.out.print("END");
		
}
}


