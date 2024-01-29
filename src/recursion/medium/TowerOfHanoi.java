package recursion.medium;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int T = sc.nextInt();//total testcases
//        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;

            //taking input N
            N = sc.nextInt();

            //calling toh() method
            System.out.println(obj.toh(N, 1, 3, 2));
        }
//    }
}

class Hanoi {
    public long toh(int N, int from, int to, int aux) {
        if (N == 0){
            return 0l;
        }

        int count = 0;
        // for n = 3, Initially move n-1 disc from 1st rod to 2nd rod using 3rd rod...
        // (here 1st rod is source rod, 2nd rod is auxiliary rod and 3rd rod is destination rod)
        // After this 1st rod having 1 largest disc and 2nd is having 2 rods and 3rd is empty.....
        count += toh(N-1, from, aux, to);
        // Move one disc from 1st rod to 3rd rod.....
        // After this 1st rod is empty and 2nd rod is having 2 rods, and 3rd rod is having 1 and the largest disc...);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        count++;
        // After above operations now we have to send all disc from rod 2nd to rod 3rd using rod 1st....
        // So 2nd rod is source now and 3rd rod is destination and 1st rod is auxiliary rod...
        // So the recursive call will be move n-1 discs from 2nd rod to 3rd using 1st rod.....
        count += toh(N-1, aux, to, from);

        return count;
    }
}