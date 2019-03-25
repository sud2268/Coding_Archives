package Rough;



import java.util.*;
import java.lang.*;
import java.io.*;

class Armstron {
	public static void main (String[] args) {
		Scanner ob=new Scanner(System.in);
		int test=ob.nextInt();
        while(test-->0){
            int n=ob.nextInt();
            //digit extraction
            int temp=n;
            int sum=0;
            while(temp>0){
                int lastDigit=temp%10;
                int cube=lastDigit*lastDigit*lastDigit;
                sum+=cube;

                //procesing
                temp/=10;

            }

            if(sum==n){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
	}
}

