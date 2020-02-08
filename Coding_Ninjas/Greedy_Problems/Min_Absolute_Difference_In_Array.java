package Coding_Ninjas.Greedy_Problems;

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
