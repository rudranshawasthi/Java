package Coding_Ninjas.Dyanamic_Programing_2;
/*
    Edit Distance - Problem
    Given two strings s and t of lengths m and n respectively, find the Edit Distance between the strings.
    Edit Distance of two strings is minimum number of steps required to make one string equal to other.
    In order to do so you can perform following three operations only :

    1. Delete a character
    2. Replace a character with another one
    3. Insert a character

    Note - Strings don't contain spaces

    Input Format :
        Line 1 : String s
        Line 2 : String t

    Output Format :
        Line 1 : Edit Distance value

    Constraints
        1<= m,n <= 20

    Sample Input 1 :
        abc
        dc

    Sample Output 1 :
        2
 */

import java.util.Scanner;

public class Edit_Distance {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        String a = z.next();
        String b = z.next();
        System.out.println(editDisti(a, b));
    }

//    private static int editDisti(String a, String b) {
//        if (a.length() == 0 || b.length() == 0){
//            return 0;
//        }
//        if (a.charAt(0) == b.charAt(0)){
//            return editDist(a.substring(1),b.substring(1));
//        }
//        else {
//            int op1 = 1 + editDist(a.substring(1),b.substring(1));
//            int op2 = 1 + editDist(a.substring(1),b);
//            int op3 = 1 + editDist(a,b.substring(1));
//            return Math.min(op1,Math.min(op2,op3));
//        }
//    }
    private static int editDisti2(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] arr = new int[m][n];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                arr[i][j] = -1;
            }
        }
        return editDisti2Helper(a,b,arr);
    }

    private static int editDisti2Helper(String a, String b, int[][] arr) {
        if (a.length() == 0 || b.length() == 0){
            return 0;
        }
    }


    private static int editDist(String a, String b) {
        return 0;
    }
}
