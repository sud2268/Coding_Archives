package RecursionPractise;

import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBoardPath(0, 10).size());
	}
	public static ArrayList<String> getBoardPath(int curr,int end){
		
		if(curr==end) {
			ArrayList<String> br =new ArrayList<>();
			br.add("");
			return br;
			
		}
		if(curr>end) {
			ArrayList<String> br =new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr =new ArrayList<>();
		for (int i = 1; i <= 6; i++) {
			ArrayList<String> rr=getBoardPath(curr+i, end);

			for(String rrs:rr) {
				mr.add(rrs+i);
				
			}
		}
		return mr;

	}

}
