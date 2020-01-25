package Coding_Ninjas.Language_Tools_Assignment;
/*
    Pair sum to 0
        Given a random integer array A of size N. Find and print the pair of elements in the array which sum to 0.
        Array A can contain duplicate elements.
        While printing a pair, print the smaller element first.
        That is, if a valid pair is (6, -6) print "-6 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.

    Input format :
        Line 1 : Integer N (Array size)
        Line 2 : Array elements (separated by space)

    Output format :
        Line 1 : Pair 1 elements (separated by space)
        Line 2 : Pair 2 elements (separated by space)
        Line 3 : and so on

    Constraints :
        1 <= N <= 10^6
        Ai contains all non-zero values

    Sample Input:
        5
        2 1 -2 2 3

    Sample Output :
        -2 2
        -2 2
 */


import java.util.Arrays;
import java.util.Scanner;

public class Pair_sum_to_0 {
    public static void main(String ae[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];
        int i,m,j;
        for(i=0;i<n;i++){
            arr[i] = z.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i] > 0){
                break;
            }
        }
        m = i;
        for(i = 0;i< m;i++){
            for(j=m;j<n;j++){
                if(arr[i] + arr[j] == 0)
                    System.out.println(arr[i]+" "+arr[j]);
                else if(arr[i] + arr[j] > 0){
                    break;
                }
            }
        }
    }
}
