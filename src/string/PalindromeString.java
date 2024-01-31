package string;
import java.io.*;
import java.util.*;

public class PalindromeString {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}

class Solution {
    // TC:- O(n)
    int isPalindrome(String S) {
        int i = 0, j = S.length() - 1;

        while (i < j){
            if (!(S.charAt(i++) == S.charAt(j--))){
                return 0;
            }
        }

        return 1;
    }
};