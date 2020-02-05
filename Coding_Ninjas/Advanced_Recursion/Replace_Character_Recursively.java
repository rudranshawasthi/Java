package Coding_Ninjas.Advanced_Recursion;
/*
    Replace Character Recursively
    Given an input string S and two characters c1 and c2, you need to replace every occurrence of
    character c1 with character c2 in the given string.
    Do this recursively.

    Input Format :
    Line 1 : Input String S
    Line 2 : Character c1 and c2 (separated by space)

    Output Format :
    Updated string

    Constraints :
    1 <= Length of String S <= 10^6

    Sample Input :
    abacd
    a x

    Sample Output :
    xbxcd
*/


import java.util.Scanner;

public class Replace_Character_Recursively {
    public static void main(String args[]){
        Scanner z =new Scanner(System.in);
        String str = z.nextLine();
        char c,r;
        c = z.next().charAt(0);
        r = z.next().charAt(0);
        System.out.println(replace(str,c,r,0));
    }
    public static String replace(String s,char c, char r,int i){
        if(i == s.length()){
            return s;
        }
        if(c == (s.charAt(i))){
            s = s.substring(0,i)+r+s.substring(i+1);
        }
        return replace(s,c,r,i+1);
    }
}
