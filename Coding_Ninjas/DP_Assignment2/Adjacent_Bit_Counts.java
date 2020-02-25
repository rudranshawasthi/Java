package Coding_Ninjas.DP_Assignment2;
/*
Adjacent Bit Counts
Send Feedback
For a string of n bits x1,x2,x3,...,Xn the adjacent bit count of the string (AdjBC(x)) is given by
X1*X2 + X2*X3 + X3*X4 + ... + Xn-1 * Xn
which counts the number of times a 1 bit is adjacent to another 1 bit. For example:
AdjBC(011101101) = 3
AdjBC(111101101) = 4
AdjBC(010101010) = 0
Write a program which takes as input integers n and k and returns the number of bit strings x of n bits (out of 2ⁿ) that satisfy AdjBC(x) = k. For example, for 5 bit strings, there are 6 ways of getting AdjBC(x) = 2:
11100, 01110, 00111, 10111, 11101, 11011
Input
The first line of input contains a single integer P, (1 ≤ P ≤ 1000), which is the number of data sets that follow. Each data set is a single line that contains the data set number, followed by a space, followed by a decimal integer giving the number (n) of bits in the bit strings, followed by a single space, followed by a decimal integer (k) giving the desired adjacent bit count. The number of bits (n) will not be greater than 100.
Output
For each data set there is one line of output. It contains the data set number followed by a single space, followed by the number of n-bit strings with adjacent bit count equal to k. As answer can be very large print your answer modulo 10^9+7.
Sample Input
10
1 5 2
2 20 8
3 30 17
4 40 24
5 50 37
6 60 52
7 70 59
8 80 73
9 90 84
10 100 90
Sample Output
1 6
2 63426
3 1861225
4 168212501
5 44874764
6 160916
7 22937308
8 99167
9 15476
10 23076518

testcases
input
10
1 5 2
2 20 8
3 30 17
4 40 24
5 50 37
6 60 52
7 70 59
8 80 73
9 90 84
10 100 90
output
1 6
2 63426
3 1861225
4 168212501
5 44874764
6 160916
7 22937308
8 99167
9 15476
10 23076518
input
20
1 19 7
2 8 7
3 20 19
4 12 11
5 17 2
6 19 8
7 10 3
8 10 8
9 29 25
10 23 1
11 7 6
12 11 2
13 12 11
14 15 1
15 14 5
16 12 2
17 27 4
18 5 0
19 23 7
20 16 5
output
1 43916
2 1
3 1
4 1
5 19338
6 27428
7 187
8 2
9 82
10 289032
11 1
12 468
13 1
14 3970
15 1878
16 894
17 14947540
18 13
19 963832
20 8863
 */
public class Adjacent_Bit_Counts {
}
