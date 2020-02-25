package Coding_Ninjas.DP1_Assignment2;
/*
Alyona and Spreadsheet
Send Feedback
During the lesson small girl Alyona works with one famous spreadsheet computer program and learns how to edit tables.
Now she has a table filled with integers. The table consists of n rows and m columns. By ai, j we will denote the integer located at the i-th row and the j-th column. We say that the table is sorted in non-decreasing order in the column j if ai, j ≤ ai + 1, j for all i from 1 to n - 1.
Teacher gave Alyona k tasks. For each of the tasks two integers l and r are given and Alyona has to answer the following question: if one keeps the rows from l to r inclusive and deletes all others, will the table be sorted in non-decreasing order in at least one column? Formally, does there exist such j that ai, j ≤ ai + 1, j for all i from l to r - 1 inclusive.
Alyona is too small to deal with this task and asks you to help!
Input
The first line of the input contains two positive integers n and m (1 ≤ n·m ≤ 100 000) — the number of rows and the number of columns in the table respectively. Note that your are given a constraint that bound the product of these two integers, i.e. the number of elements in the table.

Each of the following n lines contains m integers. The j-th integers in the i of these lines stands for ai, j (1 ≤ ai, j ≤ 109).

The next line of the input contains an integer k (1 ≤ k ≤ 100 000) — the number of task that teacher gave to Alyona.

The i-th of the next k lines contains two integers li and ri (1 ≤ li ≤ ri ≤ n).
Output
Print "Yes" to the i-th line of the output if the table consisting of rows from li to ri inclusive is sorted in non-decreasing order in at least one column. Otherwise, print "No".
Sample Input
5 4
1 2 3 5
3 1 3 2
4 5 2 3
5 5 3 2
4 4 3 4
6
1 1
2 5
4 5
3 5
1 3
1 5
Sample Output
Yes
No
Yes
Yes
Yes
No

testcases
input
5 4
1 2 3 5
3 1 3 2
4 5 2 3
5 5 3 2
4 4 3 4
6
1 1
2 5
4 5
3 5
1 3
1 5
output
Yes
No
Yes
Yes
Yes
No
input
8 10
252745 922229 405523 80616 604031 656753 555657 810562 34333 894935
769237 648820 252555 725567 848358 131620 626853 140654 427646 813426
171677 712301 933470 293206 790836 577637 146232 154484 820531 544013
165014 758188 994686 905965 113104 495290 447979 480522 302492 830726
851738 934790 476308 497483 302804 80141 612308 738240 804270 318540
490831 538838 194242 878265 672350 638101 138815 530533 644912 590676
255137 114249 743541 878849 476743 813010 172571 731444 604968 397550
115801 815275 240061 796063 403290 556562 24087 735476 347442 136491
10
4 6
1 8
4 8
4 8
1 7
6 8
3 5
4 8
3 4
1 4
output
Yes
No
No
No
No
Yes
Yes
No
Yes
No

 */
public class Alyona_and_Spreadsheet {
}
