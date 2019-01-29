	package RecursionPractise;

import java.util.ArrayList;
//To traverse on maze from initial position to food

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMazePath(0, 0, 2, 2 ));
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
			mr.add("H"+rs);
		}
		for (String rsv : rrv) {
			mr.add("V"+rsv);
		}
		return mr;
		
	}

}
