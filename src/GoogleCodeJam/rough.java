package GoogleCodeJam;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		char ch='a';
		if((ch-a)<97) {
			 ch=(char)(ch-a+26);
		}else {
			 ch=(char)(ch-a);
		}
		System.out.println((int)('z'));
		System.out.println(ch);
	}

}
