
public class allBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "1??0?101"; 
	        char[] str = input.toCharArray(); 
	        print(str, 0); 
	}
																																															
	public static void print(char a[],int index) {
		
		if(index==a.length) {
			System.out.println(a);
			return ;
		}
		
			if(a[index]=='?') {
				a[index]='0';
				print(a,index+1);
				
				a[index]='1';
				print(a,index+1);
				
				a[index]='?';
				
			}
			else
				print(a,index+1);
			
		
	}

}
									