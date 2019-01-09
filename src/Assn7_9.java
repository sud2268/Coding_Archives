import java.util.*;
public class Assn7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		System.out.println(hiCount2(word, 0));
		System.out.println(hiRemove(word, ""));
		System.out.println(hiRemoveByeAdd(word, ""));
	}
//	public static int hiCount(String s, int index,int sum) {
//
//		if(s.length()<2) {
//			return sum;
//		}
//		if(s.charAt(0)=='h'&& s.charAt(1)=='i') {
//			if( s.charAt(2)=='t'||s.charAt(2)==' ')
//				sum=hiCount(s.substring(1), index, sum);
//			else
//				sum=hiCount(s.substring(1), index, sum+1);
//
//		}
//		else
//			sum=hiCount(s.substring(1), index, sum);
//
//		return sum;
//	}

	public static int hiCount2(String s,int sum) {

		if(s.length()==0) {
			return sum;
		}
		
		if(s.charAt(0)=='h'&& s.charAt(1)=='i') {

			sum=hiCount2(s.substring(1), sum+1);
		}
		else if(s.charAt(0)=='h'&& s.charAt(1)=='i'&& s.charAt(2)=='t') {

			sum=hiCount2(s.substring(1),  sum);
		}
		else
			sum=hiCount2(s.substring(1), sum);

		return sum;
	}

	public static String hiRemove(String unprocessed,String processed) {

		if(unprocessed.length()==0) {
			return processed;
		}
		
		if(unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i') {

			processed=hiRemove(unprocessed.substring(2), processed);
		}
		else if(unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i'&& unprocessed.charAt(2)=='t') {
			
			processed=hiRemove(unprocessed.substring(3), processed+"hit");
		}
		else
			processed=hiRemove(unprocessed.substring(1), processed+unprocessed.substring(0, 1));

		return processed;
	}

	public static String hiRemoveByeAdd(String unprocessed,String processed) {

		if(unprocessed.length()==0) {
			return processed;
		}
		
		if(unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i') {

			processed=hiRemoveByeAdd(unprocessed.substring(2), processed+"bye");
		}
		else if(unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i'&& unprocessed.charAt(2)=='t') {
			
			processed=hiRemoveByeAdd(unprocessed.substring(3), processed+"hit");
		}
		else
			processed=hiRemoveByeAdd(unprocessed.substring(1), processed+unprocessed.substring(0, 1));

		return processed;
	}
}

