package Coding_Ninjas.Dynamic_Programming_1;
/*
    Magic Grid Problem
    You are given a magrid S ( a magic grid ) having R rows and C columns. Each cell in this magrid has either
    a Hungarian horntail dragon that our intrepid hero has to defeat, or a flask of magic potion that his teacher
    Snape has left for him. A dragon at a cell (i,j) takes away |S[i][j]| strength points from him, and a potion
    at a cell (i,j) increases Harry's strength by S[i][j]. If his strength drops to 0 or less at any point during
    his journey, Harry dies, and no magical stone can revive him.
    Harry starts from the top-left corner cell (1,1) and the Sorcerer's Stone is in the bottom-right corner
    cell (R,C). From a cell (i,j), Harry can only move either one cell down or right i.e., to cell (i+1,j)
    or cell (i,j+1) and he can not move outside the magrid. Harry has used magic before starting his journey
    to determine which cell contains what, but lacks the basic simple mathematical skill to determine what
    minimum strength he needs to start with to collect the Sorcerer's Stone. Please help him once again.

    Input (STDIN)
    The first line contains the number of test cases T. T cases follow. Each test case consists of R C in
    the first line followed by the description of the grid in R lines, each containing C integers. Rows are
    numbered 1 to R from top to bottom and columns are numbered 1 to C from left to right. Cells with S[i][j] < 0
    contain dragons, others contain magic potions.
    Output (STDOUT):
    Output T lines, one for each case containing the minimum strength Harry should start with from the cell (1,1)
    to have a positive strength through out his journey to the cell (R,C).
    Constraints:
    1 ≤ T ≤ 5
    2 ≤ R, C ≤ 500
    -10^3 ≤ S[i][j] ≤ 10^3
    S[1][1] = S[R][C] = 0
    Sample Input
    3
    2 3
    0 1 -3
    1 -2 0
    2 2
    0 1
    2 0
    3 4
    0 -2 -3 1
    -1 4 0 -2
    1 -2 -3 0

    Sample Output
    2
    1
    2

    Test case 1
    Input:
    3
    2 3
    0 1 -3
    1 -2 0
    2 2
    0 1
    2 0
    3 4
    0 -2 -3 1
    -1 4 0 -2
    1 -2 -3 0

    Output:
    2
    1
    2

    Test case 2:
    Input:
    3
    5 8
    0 -86 -8 -29 -71 -18 -25 92
    93 -46 -82 -89 -74 -96 -2 -84
    -93 -81 -61 -97 83 -52 -58 -54
    -7 83 -96 2 -19 -96 65 -77
    -100 65 37 -54 3 -23 -52 0
    7 7
    0 -16 37 92 -98 16 -90
    -96 -53 14 -7 -98 44 -92
    -61 -43 93 -84 -98 -75 -59
    29 -16 -8 -66 -65 81 -75
    -99 -88 46 12 13 -12 -94
    99 79 34 -3 -57 2 -79
    -40 -52 69 -80 -9 -33 0
    6 5
    0 -80 -53 85 -13
    45 35 -73 -73 89
    -80 -11 61 -63 -15
    -90 -97 -68 -79 -10
    -43 -92 92 -24 78
    59 -5 10 -94 0

    Output:
    8
    17
    1
 */


import java.util.Scanner;

public class Magic_Grid_Problem {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int t = z.nextInt();
        int n ,m;
        while (t > 0){
            n = z.nextInt();
            m = z.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = z.nextInt();
                }
            }
            System.out.println(MinHealth(arr,n,m));
            t--;
        }
    }

    private static int MinHealth(int[][] arr,int n, int m) {
        int[][] op = new int[n][m];
        op[n-1][m-1] = 1;
        op[n-2][m-1] = 1;
        op[n-1][m-2] = 1;
        for (int i = n-2; i >=0 ; i--) {
            op[i][m-1] = Math.max(1,op[i+1][m-1]-arr[i+1][m-1]);
        }
        for (int i = m-2; i >= 0  ; i--) {
            op[n-1][i] =Math.max(1,op[n-1][i+1]- arr[n-1][i+1]);
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = m-2; j >= 0 ; j--) {
                op[i][j] = Math.max(1,Math.min(op[i+1][j]-arr[i+1][j],op[i][j+1]-arr[i][j+1]));
            }
        }
        return op[0][0];
    }
}
