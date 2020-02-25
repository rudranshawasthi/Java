package Coding_Ninjas.Dyanamic_Programing_2;
/*
    LCS - Problem

    Given 2 strings of S1 and S2 with lengths m and n respectively, find the length of longest common subsequence.
    A subsequence of a string S whose length is n, is a string containing characters in same relative order
    as they are present in S, but not necessarily contiguous. Subsequences contain all the strings of length
    varying from 0 to n. E.g. subsequences of string "abc" are - "",a,b,c,ab,bc,ac,abc.

    Input Format :
        Line 1 : String S1
        Line 2 : String s2

    Output Format :
        Line 1 : Length of lcs

    Sample Input :
        adebc
        dcadb

    Sample Output :
        3
 */
import java.util.Scanner;

public class LCS_Problem {

    public static int lcs(String s1, String s2) {
        if (s1.charAt(0) == '\0' || s2.charAt(0) == '\0') {
            return 0;
        }

        if (s1.charAt(0) == s2.charAt(0)) {
            return 1 + lcs(s1 + 1, s2 + 1);
        } else {
            int option1 = lcs(s1, s2 + 1);
            int option2 = lcs(s1 + 1, s2);
            return Math.max(option1, option2);
        }
    }

    public static int lcsI(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[n+1][m + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <=n ;i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j<= n; j++) {
                if (s1.charAt(m - i) == s2.charAt(n - j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }	else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static int lcs2Helper(String s1, String s2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] > -1) {
            return dp[m][n];
        }

        int ans;
        if (s1.charAt(0) == s2.charAt(0)) {
            ans = 1 + lcs2Helper(s1 + 1, s2 + 1, m - 1, n - 1, dp);
        } else {
            int option1 = lcs2Helper(s1, s2 + 1, m, n - 1, dp);
            int option2 = lcs2Helper(s1 + 1, s2, m - 1, n, dp);
            ans = Math.max(option1, option2);
        }
        dp[m][n] = ans;
        return ans;
    }

    public static int lcs2(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[n+1][m + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs2Helper(s1, s2, m, n, dp);
    }

    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        String a = z.next();
        String b = z.next();
        System.out.println(lcsI(a,b));
        System.out.println(lcs2(a,b));
        System.out.println(lcs(a,b));
    }

}
