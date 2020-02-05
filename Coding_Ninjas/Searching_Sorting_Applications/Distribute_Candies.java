package Coding_Ninjas.Searching_Sorting_Applications;
/*
    Distribute Candies
    Shaky has N (1<=N<=50000) candy boxes each of them contains a non-zero number of candies
    (between 1 and 1000000000). Shaky want to distibute these candies among his
    K (1<=K<=1000000000) IIIT-Delhi students. He want to distibute them in a way such that:
    1. All students get equal number of candies.
    2. All the candies which a student get must be from a single box only.
    As he want to make all of them happy so he want to give as many candies as possible.
    Help Shaky in finding out what is the maximum number of candies which a student can get.

    Input
    First line contains 1<=T<=20 the number of test cases. Then T test cases follow.
    First line of each test case contains N and K. Next line contains N integers,
    ith of which is the number of candies in ith box.

    Output
    For each test case print the required answer in a seperate line.

    Sample Input:
    2
    3 2
    3 1 4
    4 1
    3 2 3 9

    Sample Output:
    3
    9
 */
import java.util.*;
import java.io.*;


public class Distribute_Candies {
    public static void main(String args[]){
        Scanner  z = new Scanner(System.in);
        int t = z.nextInt();
        int n,k,mid;
        while (t>0){
            n = z.nextInt();
            k = z.nextInt();
            int ans=0,min=0,max=0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = z.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            mid = (min+max)/2;
            while(min <= max){
                if(check(mid,arr,k)){
                    min = mid+1;
                    ans = mid;
                }
                else{
                    max = mid-1;
                }
                mid =(min + max)/2;
            }
            System.out.println(ans);
            t--;
        }
    }
    public static boolean check(int t,int[] ar,int k){
        int c= 0;
        for (int i = 0; i < ar.length; i++) {
            c+=ar[i]/t;
            if(c >= k)
                return true;
        }
        return false;
    }
}
