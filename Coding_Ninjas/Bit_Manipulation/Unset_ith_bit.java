package Coding_Ninjas.Bit_Manipulation;
/*
    Unset ith bit
        You are given two integers N and i. You need to make ith bit of binary representation of
        N to 0 and return the updated N.
        Counting of bits start from 0 from right to left.

    Input Format :
    Two integers N and i (separated by space)

    Output Format :
    Updated N

    Sample Input 1 :
    7 2

    Sample Output 1 :
    3

    Sample Input 2 :
    12 1

    Sample Output 2 :
    12

 */

import java.util.Scanner;

public class Unset_ith_bit {
    public static int turnOffIthBit(int n, int i) {
        //Your code goes here
        n=n & ~(1 << (i));
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = s.nextInt();
        System.out.println(turnOffIthBit(n, i));
    }
}
