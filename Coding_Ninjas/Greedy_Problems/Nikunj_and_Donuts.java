package Coding_Ninjas.Greedy_Problems;
/*
    Nikunj and Donuts
        Nikunj loves donuts, but he also likes to stay fit. He eats n donuts in one sitting, and
        each donut has a calorie count, ci. After eating a donut with k calories, he must walk
        at least 2^j x k(where j is the number donuts he has already eaten) miles to maintain his weight.
        Given the individual calorie counts for each of the n donuts, find and print a long integer denoting
        the minimum number of miles Nikunj must walk to maintain his weight. Note that he can eat the donuts
        in any order.

    Input
        The first line contains an integer, n, denoting the number of donuts.
        The second line contains n space-separated integers describing the respective calorie counts
        of each donut I, i.e ci.

    Output
        Print a long integer denoting the minimum number of miles Nikunj must walk to maintain his weight.

    Constraints
        1 ≤ n ≤ 40
        1 ≤ ci ≤ 1000

    Sample Input
        3
        1 3 2

    Sample Output
        11
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Nikunj_and_Donuts {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        Integer[] donuts = new Integer[n];
        for (int i = 0; i < n; i++) {
            donuts[i] = z.nextInt();
        }
        Arrays.sort(donuts, Collections.reverseOrder());
        long ans=0;
        for (int i = 0; i < n; i++) {
            ans += donuts[i] * (long)Math.pow(2,i);
        }
        System.out.println(ans);
    }
}
