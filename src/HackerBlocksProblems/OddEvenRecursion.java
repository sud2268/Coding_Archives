package HackerBlocksProblems;
import	java.util.*;
public class OddEvenRecursion {
    public static void main(String args[]) {
        // Your Code Here
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        rec(a);
    }
    public  static void rec(int n){
        if(n<=0)
            return;
            
        if(n%2!=0){
            
            System.out.println(n);
            rec(n-1);
           
        }
        if(n%2==0){
            rec(n-1);
            System.out.println(n);
             

        }
    }
}
