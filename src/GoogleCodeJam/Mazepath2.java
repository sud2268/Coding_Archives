package GoogleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Mazepath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test=ob.nextInt();
		int i=0;
		while(i++<test) {
			int N=ob.nextInt();
			ob.nextLine();
			String P=ob.nextLine();
		//	String sol=maze(N,P);
		//	System.out.println(mazePathBU(N-1, N-1));
		//	System.out.println(mazePathTD(0, 0, N-1, N-1,new int[N+1][N+1]));
		//	System.out.println(getMazePath(0, 0, N-1, N-1));
			System.out.println(check(P, N));
		}
	}

	public static String check(String p,int n) {
		ArrayList<String > list=getMazePath(0, 0, n-1, n-1);
		String res="";
		for (int i = 0; i < list.size(); i++) {
			if(!p.equals(list.get(i))){
				res=list.get(i);
				break;
			}
		}
		return res;
	}
	public static ArrayList<String> getMazePath(int cr,int cc,int er,int ec){
		//base case
		if(cr>er) { 		//**this case will not contribute to next level
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		if(cc>ec) {
			ArrayList<String> br=new ArrayList<>();
			return br;
		}
		if(cr==er&&cc==ec) {
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		//current case when we have to add H or V to sub problem
		
		ArrayList<String> rrh=getMazePath(cr, cc+1, er, ec);
		ArrayList<String> rrv=getMazePath(cr+1, cc, er, ec);

		ArrayList<String> mr=new ArrayList<>();
		for (String rs : rrh) {
			mr.add("E"+rs);
		}
		for (String rsv : rrv) {
			mr.add("S"+rsv);
		}
		return mr;
		
	}
	
//	public static ArrayList<String > getMazePathDp(int n,String [][] arg){
//		ArrayList<String> list=new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if(i==0 && j==0) {
//					arg [i][j]="";
//				}
//				
//				if(i==n && j==n) {
//					list.add(arg[i][j]);
//				}else {
//					
//				}
//			}
//		}
//	}
 
}
