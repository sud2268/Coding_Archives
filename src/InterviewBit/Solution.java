package InterviewBit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public  static int solve(int A, int B, int C, int D, int E) {
        int s=0;
        while(A!=B && C>0){
            if(A<B &&C>0){
                A+=D;
                C--;
            }else if(B>A &&C>0){
                B+=E;
                C--;
                s++;
            }
            else {
            	
            }
        }
        
        System.out.println(s);
        if(A==B){
            return s;
        }else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		int d=ob.nextInt();
		int e=ob.nextInt();

		System.out.println(solve(a, b, c, d, e));
	}
}

