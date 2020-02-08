package Coding_Ninjas.Greedy_Problems;
/*
    Min. Absolute Difference In Array
        Given an integer array A of size N, find and return the minimum absolute difference
        between any two elements in the array.
        We define the absolute difference between two elements ai, and aj (where i != j ) is |ai - aj|.

    Input format :
        Line 1 : Integer N, Array Size
        Line 2 : Array elements (separated by space)

    Output Format :
        Minimum difference

    Constraints :
        1 <= N <= 10^6

    Sample Input :
        5
        2 9 0 4 5

    Sample Input :
        1

 */
import java.util.Arrays;
import java.util.Scanner;

public class Min_Absolute_Difference_In_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(minAbsoluteDifference(input));
    }

    public static int minAbsoluteDifference(int[] input) {
        Arrays.sort(input);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length-1 ; i++) {
            if (input[i]-input[i+1] < min)
                min = input[i]-input[i+1];
        }
        return min;
    }
}
