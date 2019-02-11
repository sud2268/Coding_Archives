package HackerBlocksProblems;
import java.util.*;
public class Sum {
    public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
     //   sum(a);
      //  Gcd(10 , 25);
        Lcm(10, 25);
    }
    
    //Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
    public static void sum(int n){
        int so=0,se=0,temp=n,count=1;
        while(temp>0){
           int d=temp%10;
            if(count%2==0 ){
                se=se+d;
            }
            else
                so=so+d;
                
            count++;
            temp/=10;
        }
        System.out.println(so+"\n"+se);
    }
    
    
    //Write a function which returns the GCD of N1 and N2. Print the value returned.
    public static void Gcd(int m,int n) {
    	int divisor =Math.min(m,n);
        int divident=Math.max(m,n);
        int remainder=1;
        while(divident%divisor!=0) {
        	remainder=divident%divisor;
        	divident=divisor;
        	divisor=remainder;
        	
        }
        System.out.println(divisor);
    }
    
    //Write a function which returns the LCM of N1 and N2. Print the value returned.
    
    public static void Lcm(int m,int n) {
    	int divisor =Math.min(m,n);
        int divident=Math.max(m,n);
        int remainder=1;
        while(divident%divisor!=0) {
        	remainder=divident%divisor;
        	divident=divisor;
        	divisor=remainder;
        	
        }
        
        int lcm=(m*n)/divisor;
        System.out.println(lcm);
    }


//Given a binary number ,help Von Neuman to find out its decimal representation.
    //For eg 000111 in binary is 7 in decimal.
    
	public static void convert(int n){
	int sum=0,temp=n,count=0;
	while(temp>0){
	    count++;
	    temp/=10;
	}
    for(int i=0;i<count;i++){
        int d=n%10;
        sum=(int)(sum+d*Math.pow(2,i));
        
        n/=10;
        
    }
    System.out.println(sum);
    }
    
}