package Coding_Ninjas.Basic;

import java.util.Scanner;

public class Input {
    public long[] ArrayInputL(int n){ /*Takes input of array */
        Scanner z = new Scanner(System.in);
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextLong();
        }
        return(arr);
    }
}
