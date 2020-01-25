package Coding_Ninjas.Language_Tools_Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
    Find the Unique Element
        Given an integer array of size 2N + 1. In this given array, N numbers are
        present twice and one number is present only once in the array.
        You need to find and return that number which is unique in the array.

    Note : Given array will always contain odd number of elements.

    Input format :
        Line 1 : Array size i.e. 2N+1
        Line 2 : Array elements (separated by space)

    Output Format :
        Unique element present in the array

    Constraints :
        1 <= N <= 10^6

    Sample Input :
    7
    2 3 1 6 3 6 2

    Sample Output :
        1
 */
public class Find_the_Unique_Element {
    public static void main(String ar[]){
        Scanner z =new Scanner(System.in);
        int n = z.nextInt();
        HashSet<Integer> hs =new HashSet<>();
        int i,a;
        for (i=0;i<n;i++) {
            try {
               a = z.nextInt();
            } catch (Exception E) {
                break;
            }
            if(hs.contains(a)){
                hs.remove(a);
            }
            else{
                hs.add(a);
            }
        }
        Iterator<Integer> o=hs.iterator();
        while(o.hasNext())
        {
            System.out.println(o.next());
        }
    }
}
