package Coding_Ninjas.Dynamic_Programming_1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int arr[] = new int[n+1];

        System.out.println(fib(n,arr));
        System.out.println(fibi(n));
        System.out.println(fib(n));
    }


    //Basic approach
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n-2);
    }

    //storing data as we move to avoid repetitions
    // time taken 2N
    private static int fib(int n,int[] arr) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n] > 0)
            return arr[n];
        int output = fib(n - 1, arr) + fib(n - 2, arr);
        arr[n] = output;
        return output;
    }

    //iterative solution with time N
    public static int fibi(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
