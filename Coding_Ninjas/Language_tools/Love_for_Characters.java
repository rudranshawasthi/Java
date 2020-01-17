package Coding_Ninjas.Language_tools;


import java.util.Scanner;

/*
    Love for Characters
        Ayush loves the characters ‘a’, ‘s’, and ‘p’. He got a string of lowercase letters and he wants
        to find out how many times characters ‘a’, ‘s’, and ‘p’ occurs in the string respectively.
        Help him find it out.

    Input:
        First line contains an integer denoting length of the string.
        Next line contains the string.

    Constraints:
        1<=n<=10^5
        ‘a’<= each character of string <= ‘z’

    Output:
        Three space separated integers denoting the occurrence of letters ‘a’, ‘s’ and ‘p’ respectively.

    Sample Input:
        6
        aabsas

    Sample output:
        3 2 0
 */

public class Love_for_Characters {
    public static void main(String at[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        String str = z.next();
        int i ;
        char c;
        int[] f = new int[3];
        for (i =0; i < n; i++){
            if(str.charAt(i) == 'a')
                f[0]++;
            else if(str.charAt(i) == 's')
                f[1]++;
            else if (str.charAt(i) == 'p')
                f[2]++;
        }
        System.out.println(f[0]+" "+f[1]+" "+f[2]);
    }

}
