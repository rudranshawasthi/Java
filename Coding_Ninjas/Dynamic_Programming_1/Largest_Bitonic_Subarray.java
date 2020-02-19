package Coding_Ninjas.Dynamic_Programming_1;

/*
    Largest Bitonic Subarray
        You are given an array of positive integers as input. Write a code to return the length of
        the largest such subsequence in which the values are arranged first in strictly ascending order
        and then in strictly descending order.
        Such a subsequence is known as bitonic subsequence. A purely increasing or purely decreasing
        subsequence will also be considered as a bitonic sequence with the other part empty.
    Note: that the elements in bitonic subsequence need not be consecutive in the given array but the order should remain same.

    Input Format:
        Line 1 : A positive Integer N, i.e., the size of array
        Line 2 : N space-separated integers as elements of the array

    Output Format:
        Length of Largest Bitonic subsequence

    Input Constraints:
        1<= N <= 100000

    Sample Input 1:
    6
    15 20 20 6 4 2

    Sample Output 1:
    5

    Sample Output 1 Explanation:
    Here, longest Bitonic subsequence is {15, 20, 6, 4, 2} which has length = 5.

    Sample Input 2:
    2
    1 5

    Sample Output 2:
    2

    Sample Input 3:
    2
    5 1

    Sample Output 3:
    2
 */

import java.util.Scanner;

public class Largest_Bitonic_Subarray {

    private static int longestBitonicSubarray(int[] arr) {
        int[] inc = lis(arr,arr.length);
        int[] dec = lds(arr,arr.length);
        int best = 0;
        for (int i=0;i<arr.length;i++){
            if (inc[i]+dec[i] > best+1)
                best = inc[i]+ dec[i]-1;
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(longestBitonicSubarray(arr));
    }

    private static int[] lds(int[] input, int n) {
        int[] output = new int[n];
        output[n-1] = 1;
        for (int i = n-2; i >=0; i--) {
            output[i] = 1;
            for (int j = i + 1; j < n ; j++) {
                if (input[j] > input[i]) {
                    continue;
                }
                int possibleAns = output[j] + 1;
                if (possibleAns > output[i]) {
                    output[i] = possibleAns;
                }
            }
        }
        return output;
    }
    private static int[] lis(int[] input, int n) {
        int[] output = new int[n];
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[i]) {
                    continue;
                }
                int possibleAns = output[j] + 1;
                if (possibleAns > output[i]) {
                    output[i] = possibleAns;
                }
            }
        }
        return output;
    }
}
