package Coding_Ninjas.Greedy_Problems;
/*
    Activity Selection
        You are given n activities with their start and finish times. Select the maximum number of
        activities that can be performed by a single person, assuming that a person can only work
        on a single activity at a time.

    Input
        The first line of input contains one integer denoting N.
        Next N lines contains two space separated integers denoting the start time and finish time
        for the ith activity.

    Output
        Output one integer, the maximum number of activities that can be performed

    Constraints
        1 ≤ N ≤ 10^6
        1 ≤ ai, di ≤ 10^9

    Sample Input
    6
    1 2
    3 4
    0 6
    5 7
    8 9
    5 9

    Sample Output
    4
 */


import java.util.*;

public class Activity_Selection {

    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int start,end;
        ArrayList<Integer> startTime = new ArrayList<>();
        ArrayList<Integer> endTime = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            startTime.add(z.nextInt());
            endTime.add(z.nextInt());
        }

    }
}
