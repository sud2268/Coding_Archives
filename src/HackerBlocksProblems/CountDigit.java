package HackerBlocksProblems;

import java.util.*;
public class CountDigit {
    public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        System.out.println(count(n,m));
        
        
    }
    public static int count(int n,int m){
        int temp=n,count=0;
        while(temp>0){
            int d=temp%10;
            if(d==m)
                count++;
            temp/=10;
            
        }
    
        return count;
    }
    
}
