package recursion.medium;

import java.util.Scanner;

public class SubsequencesOfString {
    static void printSubsequence(String str, String ans, int i) {
        if (i == str.length()){
            if (ans.length() > 0)
                System.out.println(ans);
            return;
        }

        // first time i am considering character will not consider next time....
        // HERE CONSIDERING THE CHARACTER AT i, AND MOVING TO THE NEXT CHARACTER,......
        printSubsequence(str, ans + str.charAt(i), i + 1);
        // HERE NOT CONSIDERING THE CHARACTER AT i, AND MOVING TO THE NEXT CHARACTER,......
        printSubsequence(str, ans, i + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] v = new int[s.length()];
        printSubsequence(s, "", 0);
    }
}
