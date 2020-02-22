package Coding_Ninjas.Dynamic_Programming_1;
/*
    Coin Change Problem
    You are given an infinite supply of coins of each of denominations D = {D0, D1, D2, D3, ...... Dn-1}.
    You need to figure out the total number of ways W, in which you can make change for Value V using coins
    of denominations D.
    Note : Return 0, if change isn't possible.

    Input Format
    Line 1 : Integer n i.e. total number of denominations
    Line 2 : N integers i.e. n denomination values
    Line 3 : Value V

    Output Format
    Line 1 :  Number of ways i.e. W

    Constraints :
    1<=n<=10
    1<=V<=1000

    Sample Input 1 :
    3
    1 2 3
    4

    Sample Output
    4

    Sample Output Explanation :
    Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).
 */

import java.util.Scanner;

public class Coin_Change_Problem {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int numDenominations = s.nextInt();
        int denominations[] = new int[numDenominations];
        for (int i = 0; i < numDenominations; i++) {
            denominations[i] = s.nextInt();
        }

        int value = s.nextInt();
        System.out.println(countWaysToMakeChange(denominations, value));
    }

    public static int countWaysToMakeChange(int[] d, int t) {
        int n =d.length;
        int[][] o = new int[n][t+1];
        for (int i = 0; i <n ; i++) {
                o[i][0]=1;
        }
        for(int i= n-1;i >=0 ;i--){
            for(int j=1;j<=t;j++){
                int count1 = 0;
                if (i+1 <= n-1) {
                    count1 = o[i+1][j];
                }
                int count2=0;
                if (j-d[i] >=0) {
                    count2 = o[i][j-d[i]];
                }
                o[i][j] = count2+count1;
            }
        }
        return o[0][t];
    }
}