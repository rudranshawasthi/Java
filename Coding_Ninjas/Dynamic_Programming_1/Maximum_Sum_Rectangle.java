package Coding_Ninjas.Dynamic_Programming_1;
/*
    Maximum Sum Rectangle
    Send Feedback
    Given a 2D array, find the maximum sum rectangle in it. In other words find maximum sum over all rectangles in the matrix.
    Input
    First line contains 2 numbers n and m denoting number of rows and number of columns. Next n lines contain m space separated integers denoting elements of matrix nxm.
    Output
    Output a single integer, maximum sum rectangle.
    Constraints
    1<=n,m<=100
    Sample Input
    4 5
    1 2 -1 -4 -20
    -8 -3 4 2 1
    3 8 10 1 3
    -4 -1 1 7 -6
    Sample Output
    29

    Test case 1:
    Input:
    4 5
    1 2 -1 -4 -20
    -8 -3 4 2 1
    3 8 10 1 3
    -4 -1 1 7 -6
    Output
    29
    Test case 2:
    Input:
    4 4
    -1 -2 -2 -2
    -5 -4 -1 -9
    -3 -2 -6 -3
    -4 -3 -3 -2
    output:
    -1
 */


import java.util.Scanner;

public class Maximum_Sum_Rectangle {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int n,m;
        n = z.nextInt();
        m = z.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = z.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < m; l++) {
            int[] temp = new int[n];
            for (int r = l; r < m; r++) {

                for (int i = 0; i < n ; i++) {
                    temp[i] = temp[i] +arr[i][r];
                }
                max = Math.max(kadanes(temp),max);
            }
        }
        System.out.println(max);
    }

    static int kadanes(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
