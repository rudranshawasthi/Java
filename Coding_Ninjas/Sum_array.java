package Coding_Ninjas;
/*
Sum Array
        Send Feedback
        Given a 2-d square matrix of order ‘n’, find the sum of elements of both diagonals and all boundaries elements.
        Boundary elements refer to the elements present on all the four boundaries of matrix.

        Input:
        First line will have a single integer ‘n’ denoting the order of matrix.
        Next ‘n’ lines will have ‘n’ space separated integers each denoting the elements of matrix.

        Constraints:
        1<=n<=100

        Output:
        Print a single integer denoting the sum.

        Sample input:
        3
        1 2 3
        4 5 6
        7 8 9

        Sample Output:
        45
*/

import java.util.Scanner;

public class Sum_array {
    public static  void  main(String ar[])throws Exception{
        Scanner in = new Scanner(System.in);
        int i,j,s;
        s= 0;
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (i = 0 ; i<n ;i++){
            for (j = 0; j<n ;j++ ){
                arr[i][j] = in.nextInt();
            }
        }
        for (i = 0 ; i<n ;i++){
            for (j = 0; j<n ;j++ ){
                if (i == 0 || j == 0 || i == n-1 || j ==n-1 || j==n-1-i || i==j){
                    s += arr[i][j];
                }
            }
        }
        System.out.print(s);
    }

}
