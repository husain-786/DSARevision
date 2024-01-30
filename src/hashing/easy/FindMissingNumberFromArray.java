package hashing.easy;

import java.io.*;
import java.util.*;

public class FindMissingNumberFromArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
    static class Solution {
        // TC = O(2n)
        int missingNumber(int array[], int n) {
            // Your Code Here
            HashMap<Integer, Integer> map = new HashMap<>();

            // Setting in HashMap, so that we would have all the present elements....   O(n)
            for (int i: array){
                map.put(i, i);
            }

            // Finding which element is not present..... O(n)
            for (int i=1; i<=n; i++){
                if (!map.containsKey(i)){
                    return i;
                }
            }

            return -1;
        }
    }

}
