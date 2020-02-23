package Coding_Ninjas;

import java.util.Scanner;

public class Maximise_the_sum {
    public static void main(String args[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = z.nextInt();
        }
        int m = z.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = z.nextInt();
        }
        if (arr1[0] >= arr2[0]){
            System.out.println(arr1[0]+maxSum(arr1,arr2,1,0));
        }
        else {
            System.out.println(arr2[0]+maxSum(arr2,arr1,1,0));
        }

    }

    private static int maxSum(int[] arr1, int[] arr2, int i, int j) {
        if (arr1.length <= i){
            return 0;
        }
        int first,secnod,sum;
        int p = checkcommon(arr1[i],arr2,j);
        if (p != -1){
            j = p;
            first = arr1[i]+maxSum(arr2,arr1,j+1,i);
            secnod = arr1[i] + maxSum(arr1,arr1,i+1,j);
            if (first > secnod){
                sum = first;
            }
            else
                sum = secnod;
        }
        else {
            sum = arr1[i] + maxSum(arr1, arr2, i + 1, j);
        }
        return sum;
    }
    private static int checkcommon(int ele, int[] arr2, int j) {
        for (int i = j; i < arr2.length; i++) {
            if (ele == arr2[i]){
                return i;
            }
        }
        return -1;
    }
}
