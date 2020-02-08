package Coding_Ninjas.Searching_Sorting_Applications;
/*
       Aggressive Cows Problem
       Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are
       located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).
       His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each
       other once put into a stall. To prevent the cows from hurting each other, FJ wants to
       assign the cows to the stalls, such that the minimum distance between any two of them
       is as large as possible. What is the largest minimum distance?

       Input
       t – the number of test cases, then t test cases follows.
       * Line 1: Two space-separated integers: N and C
       * Lines 2..N+1: Line i+1 contains an integer stall location, xi

       Output
       For each test case output one integer: the largest minimum distance.

       Sample Input :
       1
       5 3
       1
       2
       8
       4
       9

       Sample Output:
       3

       Output details:
       FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
       resulting in a minimum distance of 3.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows_Problem{
       public static boolean Test(long[] ar,long d,int c){
              int l = ar.length;
              int x=1,pre=0,cur=1;
              for (int i = 1; i < c; i++){
                     try{
                         while(x < c ){
                                if(ar[cur] - ar[pre]  >= d){
                                       pre=cur;
                                       cur++;
                                       x++;
                                }
                                else {
                                       cur++;
                                }
                         }
                     }
                     catch (Exception ArrayIndexOutOfBound){
                            return false;
                     }
              }
              return true;
       }

       public static void main(String args[]){
              Scanner z = new Scanner(System.in);
              int t, n, c;
              long max, min, mid,arr[],ans= 0;

              t = z.nextInt();
              z.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
              for (int i = 0; i < t; i++) {
                     n = z.nextInt();
                     z.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                     c = z.nextInt();
                     z.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                     arr = new long[n];
                     for(i = 0;i<n;i++)
                            arr[i] = z.nextLong();
                     Arrays.sort(arr);
                     max = arr[n-1] - arr[0];
                     min = arr[0];
                     while(min <= max){
                          mid = (int)((max+min)/2);
                          if(Test(arr,mid,c)){
                                 min = mid+1;
                                 ans =mid;
                          }
                          else{
                                 max = mid-1;
                          }
                     }
                     System.out.println(ans);
              }
            
       }
}
