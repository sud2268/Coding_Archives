package HackerBlocksProblems;

import java.util.*;
public class fibonacci {
    public static void main(String args[]) {
        // Your Code Here
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        fibonacci(a);
    }
    public static void fibonacci(int n){
        int x=-1,y=1,z=0;
        for (int i=0; i<n; i++ ){
            x=y;
            y=z;
            z=x+y;
         System.out.println(z);
        } 
    }
    
}