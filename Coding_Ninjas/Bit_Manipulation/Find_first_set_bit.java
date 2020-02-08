package Coding_Ninjas.Bit_Manipulation;
/*
    Find first set bit
        You are given an integer N. You need to return an integer M, in which only one bit is set which
        at position of lowest set bit of N (from right to left).

    Input Format :
    Integer N

    Output Format :
    Integer M

    Sample Input 1 :
    7

    Sample Output 1 :
    1

    Sample Input 2 :
    12

    Sample Output 2 :
    4
 */

import java.util.Scanner;

public class Find_first_set_bit {
    public static int returnFirstSetBit(int n) {
        for(int i=0;i<n;i++){
            if((n & (1<<i))!=0){
                return (int) Math.pow(2,i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.println(returnFirstSetBit(n));
    }

}
