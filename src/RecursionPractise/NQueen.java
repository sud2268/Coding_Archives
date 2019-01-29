package RecursionPractise;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][]board=new boolean[4][4];
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				board[i][j]=false;
//			}
//		}
//	System.out.println(countNQueen(board, 0));
		
		printNQueen(board, 0, "");
	} 
	public static int countNQueen(boolean[][]board,int row) {
		if(row==board.length)
			return 1;
		
		int count =0;
		for (int col = 0; col <board[row].length ; col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				count+=countNQueen(board, row+1);
				board[row][col]=false;
			}
		}
		return count;
	}

	public static boolean isSafe(boolean[][] board,int row,int column) {
		
		for (int i = 0; i < row; i++) {
			if(board[i][column]==true)
				return false;
		}
		int ro=row,col=column;
		while(ro>=0&&col>=0) {
			if(board[ro--][col--]==true)
				return false;
		}
		
		ro=row;col=column;
		while(ro>=0&&col<board.length) {
			if(board[ro--][col++]==true)
				return false;
		}
		
		
		return true;
				
	}
	
	public static void printNQueen(boolean[][]board,int row,String result) {
		if(row==board.length) {
			System.out.println(result);
			return;
		}
			
		
		
		for (int col = 0; col <board[row].length ; col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				printNQueen(board, row+1,result+"{"+(row+1)+","+(col+1)+"};");
				board[row][col]=false;
			}
		}
		
	}
	
	
}
