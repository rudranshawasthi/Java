package Coding_Ninjas.Language_Tools_Assignment;
/*
    Rotate array
        Given a random integer array of size n, write a function that rotates the given array
        by d elements (towards left)
        Change in the input array itself. You don't need to return or print elements.

    Input format :
        Line 1 : Integer n (Array Size)
        Line 2 : Array elements (separated by space)
        Line 3 : Integer d

    Output Format :
        Updated array elements (separated by space)

    Constraints :
        1 <= N <= 1000
        1 <= d <= N

    Sample Input :
        7
        1 2 3 4 5 6 7
        2

    Sample Output :
        3 4 5 6 7 1 2
 */


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate_array {
    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr = new int[n];
        int d,i,j,temp;
        for(i=0;i<n;i++){
            arr[i] = z.nextInt();
        }
        d = z.nextInt();
        for(i=0;i<d;i++){
            temp = arr[0];
            for(j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
