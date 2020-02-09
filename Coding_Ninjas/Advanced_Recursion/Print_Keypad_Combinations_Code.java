package Coding_Ninjas.Advanced_Recursion;
/*
    Return Keypad Code
        Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
        Return empty string for numbers 0 and 1.
        Note : The order of strings are not important.

    Input Format :
        Integer n

    Output Format :
        All possible strings in different lines

    Constraints :
        1 <= n <= 10^6

    Sample Input:
        23

    Sample Output:
        ad
        ae
        af
        bd
        be
        bf
        cd
        ce
        cf
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Keypad_Combinations_Code {
    public static String keypad[][] = {
            {"0"}, {"1"}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"},
            {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"},
            {"t", "u", "v"}, {"w", "x", "y", "z"}
    };

    public static ArrayList<String> combo = new ArrayList<>();


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        printKeypad(input);
    }


    public static void printKeypad(int n){
        help(n);;
        for (int i = 0; i < combo.size(); i++) {
            System.out.println(combo.get(i));
        }
    }


    public static void help(int n ){

        if(n == 0){
            combo.add("");
            return;
        }

        int d = n%10;
        n = n/10;

        help(n);


        ArrayList<String> temp = new ArrayList<>(combo);
        int j=0,l =combo.size();
        for (int i = 1; i < keypad[d].length; i++) {
            combo.addAll(temp);
        }


        for (int i = 0; i < combo.size(); i++)
        {
            combo.set(i,(combo.get(i)+keypad[d][j]));
            if((i+1)%l==0)
                j += 1;
        }
    }

}
