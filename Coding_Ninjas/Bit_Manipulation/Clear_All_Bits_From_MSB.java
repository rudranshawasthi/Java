package Coding_Ninjas.Bit_Manipulation;
/*
    Clear All Bits From MSB
        You are given two integers N and i. You need to clear all bits from MSB to ith
        bit (start i from right to left) and return the updated N.
        Counting of bits starts from 0 from right to left.

    Input Format :
    Two integers N and i (separated by space)

    Output Format :
    Updated N

    Sample Input 1 :
    15 2

    Sample Output 1 :
    3

    Sample Output 1 Explanation :
    We need to clear all bits from MSB to ith bit i.e. clear all bits except 0th and 1st.

    Sample Input 2 :
    4 4

    Sample Output 2 :
    4
 */

import java.util.Scanner;

public class Clear_All_Bits_From_MSB {
    public static int clearAllBits(int n, int i) {
        n = n & ((1<<i)-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = s.nextInt();
        System.out.println(clearAllBits(n, i));
    }

}
