package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstAndLastOccurence {
    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}


/*class Solution
{
    ArrayList<Integer> find(int arr[], int n, int x) {
        // Brute Force Apppoach
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int first = -1, last = -1;

        // Finding first occurence....
        for (int i=0; i<n; i++){
            if (arr[i] == x){
                first = i;
                break;
            }
        }
        ans.add(first);

        // Finding last occurence....
        for (int i=n-1; i>0; i--){
            if (arr[i] == x){
                last = i;
                break;
            }
        }
        ans.add(last);

        return ans;
    }
}*/


/*class Solution {
    // TC: O(2logn) = O(logn)
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // Brute Force Apppoach
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int first = -1, last = -1;
        int low = 0, high = n-1;

        // Finding first occurence....  TC = O(logn)
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        ans.add(first);

        // Finding last occurence....   TC = O(logn)
        low = 0; high = n-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        ans.add(last);

        return ans;
    }
}*/

class Solution {
    // TC:- O(logn)
    public static int firstOcc (int[] a, int target)
    {
        int low = 0;
        int high = a.length - 1;
        int fo = -1;

        while (low <= high)
        {
            int mid = (low + high)/2;

            if (a[mid] == target){
                fo = mid;
                high = mid - 1;
            }
            else if (a[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return fo;
    }

    // TC:- O(logn)
    public static int lastOcc (int[] a, int target)
    {
        int low = 0;
        int high = a.length - 1;
        int lo = -1;

        while (low <= high)
        {
            int mid = (low + high)/2;

            if (a[mid] == target){
                lo = mid;
                low = mid + 1;
            }
            else if (a[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return lo;
    }

    // TC:- O(2logn) = O(logn)
    public ArrayList<Integer> find(int[] nums,  int n, int target) {
        int fo = firstOcc(nums, target);
        int lo = lastOcc(nums, target);
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(fo);
        res.add(lo);
        return res;
    }
}

/*

I/P:-
1
9 7
1 3 5 5 5 5 7 123 125
O/P:-
6 6

I/P:-
1
9 5
1 3 5 5 5 5 7 123 125
O/P:-
2 5

I/P:-
1
7 8
5 7 7 7 8 8 8
O/P:-
4 6

*/