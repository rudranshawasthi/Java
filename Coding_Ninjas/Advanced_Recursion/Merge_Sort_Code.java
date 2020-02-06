package Coding_Ninjas.Advanced_Recursion;

import java.util.Scanner;

public class Merge_Sort_Code {

    static void mergeSort(int A[],int left,int right){
        if(right > left){
            int mid = (left + right)/2;

            mergeSort(A,left,mid);
            mergeSort(A,mid+1,right);
            merge(A,left,mid+1,right);
        }
    }
    static void merge(int A[],int left,int mid,int right) {
        int i = left, j = mid, k = 0;

        int[] temp = new int[right - left + 1];
        while (i < mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }
        while (i < mid) {
            temp[k++] = A[i++];
        }
        while (j <= right) {
            temp[k++] = A[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            A[i] = temp[k];
        }
    }
    public static void mergeSort(int[] input){
        // Write your code here
        mergeSort(input,0,input.length-1);
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        mergeSort(input);
        printArray(input);
    }
}