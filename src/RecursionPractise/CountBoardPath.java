package RecursionPractise;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(0, 10));
	}
	public static int count(int curr,int end) {
		if(curr==end ) {
			return 1;
		}
		if(curr>end)
			return 0;
		
		int sum=0;
		for(int i=1;i<=6;i++) {
			sum+=count(curr+i, end);
		}
		
		return sum;
		
	}

}
