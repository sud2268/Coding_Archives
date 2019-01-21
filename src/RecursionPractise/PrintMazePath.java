package RecursionPractise;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintMaze(0, 0, 2, 2, "");
		//System.out.println(CountMaze(0, 0, 2, 2));
		PrintMazeDiag(0, 0, 2, 2, "");
		System.out.println(CountMazeDiag(0, 0, 2, 2, ""));
	}
	public static void PrintMaze(int cr,int cc,int er,int ec,String ans) {
		if(cr==er && cc==ec)
			System.out.println(ans);
		
		//if the move is out of the box eg(1,3)
		if(cr>er||cc>ec)
			return;
		
		PrintMaze(cr, cc+1, er, ec, ans+"H");
		PrintMaze(cr+1, cc, er, ec, ans+"V");
		
	}
	public static int CountMaze(int cr,int cc,int er,int ec) {
		if(cr==er&& cc==ec) {
			return 1;
		}
		if(cr>er||cc>ec) {
			return 0;	
		}
		int sum=0;
		sum+=CountMaze(cr, cc+1, er, ec);
		sum+=CountMaze(cr+1, cc, er, ec);
		return sum;
	}
	
	public static void PrintMazeDiag(int cr,int cc,int er,int ec,String ans) {
		if(cr==er&&cc==ec) {
			System.out.println(ans);
		}
		if(cr>er||cc>ec) {
			return;
		}
		
		PrintMazeDiag(cr, cc+1, er, ec, ans+"H");
		PrintMazeDiag(cr+1, cc, er, ec, ans+"V");
		PrintMazeDiag(cr+1, cc+1, er, ec, ans+"D");

	}
	public static int CountMazeDiag(int cr,int cc,int er,int ec,String ans) {
		if(cr==er&&cc==ec) {
			return 1;
		}
		if(cr>er||cc>ec) {
			return 0;
		}
		int sum=0;
		sum+=CountMazeDiag(cr, cc+1, er, ec, ans+"H");
		sum+=CountMazeDiag(cr+1, cc, er, ec, ans+"V");
		sum+=CountMazeDiag(cr+1, cc+1, er, ec, ans+"D");

		return sum;
	}
	
}
