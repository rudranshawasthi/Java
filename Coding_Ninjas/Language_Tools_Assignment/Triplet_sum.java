package Coding_Ninjas.Language_Tools_Assignment;
/*
    Triplet sum
        Given a random integer array and a number x. Find and print the triplets of elements in
        the array which sum to x.
        While printing a triplet, print the smallest element first.
        That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint
        that out of 5 triplets which have to be printed on 1st line. You can print
        triplets in any order, just be careful about the order of elements in a triplet.

    Input format :
        Line 1 : Integer N (Array Size)
        Line 2 : Array elements (separated by space)
        Line 3 : Integer x
    Output format :
        Line 1 : Triplet 1 elements (separated by space)
        Line 2 : Triplet 3 elements (separated by space)
        Line 3 : and so on
    Constraints :
        1 <= N <= 1000
        1 <= x <= 100
    Sample Input:
        7
        1 2 3 4 5 6 7
        12
    Sample Output ;
        1 4 7
        1 5 6
        2 3 7
        2 4 6
        3 4 5
 */

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum {
    public static void main(String ar[]){
        Scanner z= new Scanner(System.in);
        int n = z.nextInt();
        int arr[] = new int[n];
        int i,x,j,k;
        for (i=0;i<n;i++){
            arr[i]= z.nextInt();
        }
        x = z.nextInt();
        Arrays.sort(arr);
        for(i = 0;i<n;i++){
            if(x-arr[i] > 0){
                for (j=i+1;j<n;j++){
                    if(x-arr[i]-arr[j] > 0){
                        for (k=j+1;k<n;k++){
                            if(x-arr[i]-arr[j]-arr[k] == 0){
                                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}
