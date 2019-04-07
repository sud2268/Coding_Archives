package GoogleCodeJam;

import java.util.ArrayList;
import  java.util.Scanner;

public class Vidit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long test = in.nextLong();
        long i = 0;
        while (i++ < test) {
            int N = in.nextInt();
            int n = N,rem = 0;
            int mul = 0,length = 0;
            ArrayList<Integer> a = new ArrayList<>();

            while (n > 0) {
                rem = n%10;
                a.add(rem);
                length++;
                n = n/10;
            }

//            for(int j = 0;j< length;j++) {
//                if(a.get(length -1 -j) == 4) {
//                    mul = j;
//                    break;
//                }
//            }
//            System.out.println(mul);

//            int number = a.get(0);
//            int last = 0;
//            for (int j = 1;j < length ;j++) {
//            if( j < length - mul ) {
//                number += (   Math.pow(10,j)  )*a.get(j);
//            } else {
//                last += (   Math.pow(10,j)  )*a.get(j);
//            }
//
//            }

            int A = 0;
            int B = 0;

            for(int j =0;j< length;j++) {
                if( a.get(j) == 4) {
                    A += Math.pow(10,j)*2;
                    B +=  Math.pow(10,j)*2;
                } else {
                    A += Math.pow(10,j)*a.get(j);
                }
            }


//            int A = sum(number);
//            int B = number - A;
//            A += last;

            System.out.println("Case #"+ i +": " + A + " " + B);
        }
    }

   
}