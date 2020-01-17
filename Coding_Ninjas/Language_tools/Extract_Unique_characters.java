package Coding_Ninjas.Language_tools;
/*
                        Name: Rudransh Awasthi
 */

/*
    Extract Unique characters
        Given a string, you need to remove all the duplicates. That means, the output string should contain
        each character only once. The respective order of characters should remain same.

    Input format :
        String S
    Output format :
        Output String
    Constraints :
        1 <= Length of S <= 50000

    Sample Input 1 :
        ababacd
    Sample Output 1 :
        abcd

    Sample Input 2 :
        abcde
    Sample Output 2 :
        abcde
 */


import java.util.Collection;
import java.util.Scanner;

public class Extract_Unique_characters {
    public static void main(String ar[]) {
        Scanner z = new Scanner(System.in);
        String str = z.nextLine();
        int l, i;
        String res="";
        l = str.length();
        for (i = 0; i <l ; i++){
            if(res.indexOf(str.charAt(i)) == -1)
                res = res + str.charAt(i);
        }
        System.out.println(res);
    }
}
