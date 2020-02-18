package Coding_Ninjas.Dynamic_Programming_1;

import java.util.Scanner;

public class Largest_Increasing_Subsequence {
        private static int lis(int[] input, int n) {
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
        int best = 0;
        for (int i = 0; i < n; i++) {
            if (best < output[i]) {
                best = output[i];
            }
        }
        return best;
    }

    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i]=z.nextInt();
        }
        int ans = lis(input, n);
        System.out.println(ans);
    }

}
