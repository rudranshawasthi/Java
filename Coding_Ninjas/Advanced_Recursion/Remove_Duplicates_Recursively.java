package Coding_Ninjas.Advanced_Recursion;
/*
    Remove Duplicates Recursively
    Given a string S, remove consecutive duplicates from it recursively.

    Input Format :
    String S

    Output Format :
    Output string

    Constraints :
    1 <= Length of String S <= 10^3

    Sample Input :
    aabccba

    Sample Output :
    abcba

 */


import java.util.Scanner;

public class Remove_Duplicates_Recursively {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }
    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()==0){
            return "";
        }
        else if (s.length() == 1){
            return s;
        }
        String ans=s;
        if(s.charAt(0) == s.charAt(1)){
            ans = s.substring(1);
            ans = removeConsecutiveDuplicates(ans);
        }
        else {
            ans = ans.charAt(0)+ removeConsecutiveDuplicates(ans.substring(1));
        }
        return ans;
    }


}
