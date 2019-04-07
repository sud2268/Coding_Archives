package GoogleCodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ForeGone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long test=ob.nextLong();
		long i=0;
		while(i++<test) {
			int N=ob.nextInt();
			int temp=N, size=0,remainder=0;
			ArrayList<Integer> list=new ArrayList<>();
			
			while(temp>0) {
				remainder=temp%10;
				size++;
				list.add(remainder);
				temp=temp/10;
			}
			
			int A=0;
			int B=0;
			int itr=0;
			while(itr<size) {
				if(list.get(itr)==4) {
					A+=Math.pow(10, itr)*3;
					B+=Math.pow(10, itr)*1;
				}else {
					A+=Math.pow(10,itr)*list.get(itr);
				}
				
				itr++;
			}
			
			System.out.println("Case #"+ i +": " + A + " " + B);
		}
	}

}
