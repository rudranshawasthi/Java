import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    private static int top = -1;
    private static int f=-1,r = -1;
    private static char[] stack = new char[5000];
    private static char[] queue = new char[5000];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    private void pushCharacter(char c) {
        stack[++top] = c;
    }

    private void enqueueCharacter(char c) {
        queue[++r] = c;
    }

    private char dequeueCharacter() {
        return queue[++f];
    }

    private char popCharacter() {
        return stack[top--];
    }
}