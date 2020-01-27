package Coding_Ninjas.Language_Tools_Assignment;
/*
    Longest consecutive Sequence
        You are given with an array of integers that contain numbers in random order. Write a program to find
        the longest possible sequence of consecutive numbers using the numbers from given array.
        You need to return the output array which contains consecutive elements. Order of elements in the
        output is not important.
        Best solution takes O(n) time.
        If two sequences are of equal length then return the sequence starting with the number
        whose occurrence is earlier in the array.

    Input Format :
        Line 1 : Integer n, Size of array
        Line 2 : Array elements (separated by space)

    Constraints :
        1 <= n <= 50000

    Sample Input 1 :
        13
        2 12 9 16 10 5 3 20 25 11 1 8 6

    Sample Output 1 :
        8
        9
        10
        11
        12

    Sample Input 2 :
        7
        3 7 2 1 9 8 1

    Sample Output 2 :
        7
        8
        9

    Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length
    i.e. [1, 2, 3] and [7, 8, 9], but output should be [7, 8, 9] because the starting point of [7, 8, 9]
    comes first in input array.

    Sample Input 3 :
        7
        15 24 23 12 19 11 16

    Sample Output 3 :
        15
        16
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_consecutive_Sequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr){
        Map<Integer,Boolean> visitedElements = new HashMap<>();
        Map<Integer,Integer> elementToIndexMapping = new HashMap<>();

        for (int i = 0; i < arr.length; ++i)
        {
            int num = arr[i];
            elementToIndexMapping.put(num,i);
            if(!visitedElements.containsKey(num)){
                visitedElements.put(num,false);
            }
        }
        ArrayList<Integer> longestSequence = new ArrayList<>();
        int globalMaxSeqenceLength = 1;
        int globalMinStartIndex = 0;
        for (int i = 0; i < arr.length; ++i)
        {
            int num = arr[i];
            int currentMinStartIndex = i;
            int count = 0;
            int tempNum = num;

            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum,true);
                count++;
                tempNum++;
            }
            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum,true);
                count++;

                currentMinStartIndex = elementToIndexMapping.get(tempNum);
                tempNum--;
            }
            if(count > globalMaxSeqenceLength){
                globalMaxSeqenceLength = count;
                globalMinStartIndex = currentMinStartIndex;
            }else if(count == globalMaxSeqenceLength){
                if (globalMinStartIndex > currentMinStartIndex )
                {
                    globalMinStartIndex = currentMinStartIndex;
                }
            }
        }
        int globalStartNum = arr[globalMinStartIndex];
        longestSequence.add(globalStartNum);
        globalMaxSeqenceLength--;
        while(globalMaxSeqenceLength != 0){
            globalStartNum++;
            longestSequence.add(globalStartNum);
            globalMaxSeqenceLength--;
        }
        return longestSequence;
    }

    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
            for(int num: ans) {
                System.out.println(num);
            }
        }
    }
