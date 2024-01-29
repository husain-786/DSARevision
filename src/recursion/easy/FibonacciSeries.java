package recursion.easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " term of the fibonicci series:- " + fibonicciSeries(n));
    }

    // Using Loop,....
//    public static int fibonicciSeries(int n){
//        int a = 0, b = 1;
//        while (n > 0){
//            System.out.println(a);
//            int c = a + b;
//            a = b;
//            b = c;
//            n--;
//        }
//        return b;
//    }

    // Using Recursion....
//    public static int fibonicciSeries(int n){
//        if (n == 0){
//            return 0;
//        }
//        if (n == 1){
//            return 1;
//        }
//        if (n == 2){
//            return 1;
//        }
//
//        int sum = fibonicciSeries(n-1) + fibonicciSeries(n-2);
//        return sum;
//    }

    public static int fibonicciSeries(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }

        int a = fibonicciSeries(n-1);
        int b = fibonicciSeries(n-2);
        int sum =  a + b;


        return sum;
    }
}
