package recursion.medium;

import java.io.*;
import java.util.*;

/*
    Here free to move 1, 2, or 3 steps at a time.....
    e.g., if n=3 (number of stairs) then number of ways to climb are:-
        {(1,1,1), {1,2}, {2,1}, {3}}
*/

public class PrintStairPath {
    static void printStairPaths(int n, String pathSoFar) {
//        allPaths(n, "", 0);
//        allPossPaths("", n);
        commonMethod(n, "", 0);
    }

    // METHOD:-2
    static void allPossPaths(String path, int n){
        if (n == 0){
            System.out.println(path);
            return;
        }
        if (n < 0){
            return;
        }

        // If n steps to climb and only 1, 2, or 3 steps at a time are allowed then use this......
        allPossPaths(path + 1, n-1);
        allPossPaths(path + 2, n-2);
        allPossPaths(path + 3, n-3);
    }

    // METHOD:-1
    static void allPaths(int n, String path, int sum){
        if (sum > n){
            return;
        }
        if (sum == n){
            System.out.println(path);
            return;
        }

        // If n steps to climb and n steps at a time are allowed then use this......
//        for (int i = 1; i <= n; i++){
//            allPaths(n, path + i, sum+i);
//        }


        // If 3 steps are given and 1, 2, or 3 steps are allowed at a time then...
        allPaths(n, path + 1, sum+1);
        allPaths(n, path + 2, sum+2);
        allPaths(n, path + 3, sum+3);

    }

    static void commonMethod(int n, String path, int sum){
        // if sum will be same as the stairs given that menans we reached successfully, then print the path....
        if (sum > n){
            return;
        }
        if (sum == n){
            System.out.println(path);
            return;
        }

        // If n steps to climb and only 1, 2, or 3 steps at a time are allowed then use this......
        for (int i = 1; i <= 3; i++){
            commonMethod(n, path + i, sum+i);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }
}


/*
    i/p:-
        3
    o/p:-
        111
        12
        21
        3
*/