package Coding_Ninjas.Dynamic_Programming_1;
/*
    StairCase Problem
    A child is running up a staircase with n steps and can hop either 1 step, 2 steps or 3 steps at a time.
    Implement a method to count how many possible ways the child can run up to the stairs. You need to return
    all possible number of ways.
    Time complexity of your code should be O(n).

    Input format :
    Integer n (No. of steps)

    Constraints :
    n <= 70

    Sample Input 1:
    4

    Sample Output 1:
    7
 */


import java.util.Scanner;

public class StairCase_Problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
    }

    public static long staircase(int n){
        long[] combo = new long[n+1];
        combo[0]=1;
        combo[1]=1;
        combo[2]=2;
        for (int i = 3; i <= n ; i++) {
            combo[i] = combo[i - 1] + combo[i - 2]+combo[i-3];
        }
        return combo[n];
    }

}
