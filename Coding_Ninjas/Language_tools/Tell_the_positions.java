package Coding_Ninjas.Language_tools;
/*
                        Name: Rudransh Awasthi
*/
/*
    Tell the positions
        In a class there are ‘n’ number of students. They have three different subjects: Data Structures,
        Algorithm Design & Analysis and Operating Systems. Marks for each subject of all the students are
        provided to you. You have to tell the position of each student in the class. Print the names of each
        student according to their position in class. Tie is broken on the basis of their roll numbers.
        Between two students having same marks, the one with less roll number will have higher rank. The
        input is provided in order of roll number.
    Input Format:
        First line will have a single integer ‘n’, denoting the number of students in the class.
        Next ‘n’ lines each will have one string denoting the name of student and three space separated
        integers m1, m2, m3 denoting the marks in three subjects.
    Output Format:
        Print ‘n’ lines having two values: First, the position of student in the class and second his name.
    Constraints:
        1 <= n <= 10^5
        0 <= m1, m2, m3 <= 100
    Sample Input:
        3
        Mohit 94 85 97
        Shubham 93 91 94
        Rishabh 95 81 99
    Sample Output:
        1 Shubham
        2 Mohit
        3 Rishabh
 */


import java.util.*;

public class Tell_the_positions {
    static class pair implements Comparable<pair>{
        int marks;
        String name;
        pair(int m, String n){
            this.marks = m;
            this.name = n;
        }
        @Override
        public int compareTo(pair p){
            return p.marks-this.marks;
        }
    }

    public static void main(String ar[])throws Exception {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int i;
        pair[] arr = new pair[n];
        for (i = 0; i < n; i++) {
            String name = z.next();
            int marks = z.nextInt() + z.nextInt() + z.nextInt();
            arr[i] = new pair(marks,name);
        }
        Arrays.sort(arr);
        for (i=0;i<n;i++)
            System.out.println((i+1)+" "+arr[i].name);
    }
}