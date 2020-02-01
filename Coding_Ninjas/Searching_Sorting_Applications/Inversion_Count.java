package Coding_Ninjas.Searching_Sorting_Applications;
/*
    Inversion Count
        Let A[0 ... n-1] be an array of n distinct positive integers.
        If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of
        A (where i and j are indexes of A). Given an integer array A, your task
        is to find the number of inversions in A.

    Input format :
        Line 1 : n, array size
        Line 2 : Array elements (separated by space).

    Output format :
        Count of inversions

    Constraints :
        1 <= n <= 10^5
        1 <= A[i] <= 10^9

    Sample Input 1 :
        3
        3 2 1

    Sample Output 1 :
        3

    Sample Input 2 :
        5
        2 5 1 3 4

    Sample Output 1 :
        4
 */


import java.util.Scanner;

public class Inversion_Count {

    static int MAXN = 100005;

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        int[] A = new int[MAXN];
        n = scan.nextInt();
        for(int i = 0; i < n ; i++){
            A[i] = scan.nextInt();
        }
        System.out.println(solve(A,n));
    }
    static long solve(int[] A,int n){
        long inv = mergeSort(A,0,n-1);
        return inv;
    }
    static long mergeSort(int A[],int left,int right){
        long count = 0;
        if(right > left){
            int mid = (left + right)/2;

            long countLeft = mergeSort(A,left,mid);
            long countRight = mergeSort(A,mid+1,right);
            long myCount = merge(A,left,mid+1,right);

            return myCount + countLeft + countRight;
        }
        return count;
    }
    static long merge(int A[],int left,int mid,int right){
        int i=left,j=mid,k=0;

        int[] temp= new int[right-left+1];
        long count = 0;
        while(i<mid && j<=right){
            if(A[i] <= A[j]){
                temp[k++] = A[i++];
            }else{
                temp[k++] = A[j++];
                count += mid - i;
            }
        }
        while(i<mid){
            temp[k++] = A[i++];
        }
        while(j<=right){
            temp[k++] = A[j++];
        }

        for(i=left,k=0;i<=right;i++,k++){
            A[i] = temp[k];
        }
        return count;
    }
}
