package Coding_Ninjas.Language_Tools_Assignment;
/*
    Sum me Up
        There will be ‘t’ test cases having an integer. You have to sum up all the digits of
        this integer. For e.g. For 6754, the answer will be 6 + 7 + 5 + 4 = 22.

    Input Format:
        First line will have an integer ‘t’ denoting the number of test cases.
        Next ‘t’ lines will have an integer ‘val’ each.

    Output format:
        Print ‘t’ lines of output denoting the sum of all the digits of the number in each test case.

    Constraints:
        1 <= t <= 10^5
        0 <= val <= 10^18

    Sample Input:
        2
        1547
        45876

    Sample Output:
        17
        30

    Explanation:
        1 + 5 + 4 + 7 = 17
        4 + 5 + 8 + 7 + 6 = 30
 */

import java.util.Scanner;

public class Sum_me_Up {
    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        int t = z.nextInt();
        long a,i,d,s;
        for (i=0;i<t;i++){
            a = z.nextLong();
            s = 0;
            while (a>0){
                d = a%10;
                a = a/10;
                s = s+d;
            }
            System.out.println(s);
        }

    }
}
