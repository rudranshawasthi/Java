package Coding_Ninjas.Bit_Manipulation;
/*
    Set ith bit
        You are given two integers N and i. You need to make ith bit of binary representation of
        N to 1 and return the updated N.
        Counting of bits start from 0 from right to left.

    Input Format :
        Two integers N and i (separated by space)

    Output Format :
        Updated N

    Sample Input 1 :
    4 1

    Sample Output 1 :
    6

    Sample Input 2 :
    4 4

    Sample Output 2 :
    20
 */
import java.util.Scanner;

public class Set_ith_bit {
    public static int turnOnIthBit(int n, int i) {
        n=n|(1<<i);
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = s.nextInt();
        System.out.println(turnOnIthBit(n, i));
    }
}
