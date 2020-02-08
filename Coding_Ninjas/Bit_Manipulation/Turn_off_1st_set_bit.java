package Coding_Ninjas.Bit_Manipulation;
/*
    Turn off 1st set bit
        You are given an integer Ni. You need to make first set bit of binary representation of
        N to 0 and return the updated N.
        Counting of bits start from 0 from right to left.

    Input Format :
    Integer N

    Output Format :
    Updated N

    Sample Input 1 :
    4

    Sample Output 1 :
    0

    Sample Input 2 :
    12

    Sample Output 2 :
    8
 */

import java.util.Scanner;

public class Turn_off_1st_set_bit {
    public static int turnOffFirstSetBit(int n) {
        //Your code goes here
        for(int i=0;i<n;i++){
            if((n & (1<<i))!=0){
                n = n & ~(1<<i);
                break;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(turnOffFirstSetBit(n));
    }
}
