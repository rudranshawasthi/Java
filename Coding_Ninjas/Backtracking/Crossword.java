package Coding_Ninjas.Backtracking;
/*
    Crossword Problem
        CodingNinjas has provided a crossword of 10*10 grid. The grid contains '+' or '-' as its cell
        values. Now, you are also provided with a word list that needs to placed accurately in the
        grid. Cells marked with '-' are to be filled with word list.
    For example, The following is an example for the input crossword grid and the word list.
        +-++++++++
        +-++-+++++
        +-------++
        +-++-+++++
        +-++-+++++
        +-++-+++++
        ++++-+++++
        ++++-+++++
        ++++++++++
        ----------
        CALIFORNIA;NIGERIA;CANADA;TELAVIV

    Output for the given input should be:
        +C++++++++
        +A++T+++++
        +NIGERIA++
        +A++L+++++
        +D++A+++++
        +A++V+++++
        ++++I+++++
        ++++V+++++
        ++++++++++
        CALIFORNIA
    Note: We have provided such test cases that there is only one solution for the given input.

    Input format:
        The first 10 lines of input contain crossword. Each of 10 lines has a character array of size 10.
        Input characters are either '+' or '-'.
        The next line of input contains the word list, in which each word is separated by ';'.

    Output format:
        Print the crossword grid, after placing the words of word list in '-' cells.

    Sample Input 1:
        +-++++++++
        +-++-+++++
        +-------++
        +-++-+++++
        +-++-+++++
        +-++-+++++
        ++++-+++++
        ++++-+++++
        ++++++++++
        ----------
        CALIFORNIA;NIGERIA;CANADA;TELAVIV

    Sample Output 1:
        +C++++++++
        +A++T+++++
        +NIGERIA++
        +A++L+++++
        +D++A+++++
        +A++V+++++
        ++++I+++++
        ++++V+++++
        ++++++++++
        CALIFORNIA
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Crossword {

    private static char[][] grid= new char[10][10];

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String temp;
        for (int i = 0; i < 10; i++) {
            temp= z.next();
            for (int j = 0; j < 10; j++) {
                grid[i][j] = temp.charAt(j);
            }
        }
        temp = z.next();
        StringTokenizer str = new StringTokenizer(temp,";");
        int n =str.countTokens();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = str.nextToken();
        }
        fillCrossword(words,0);


    }

    private static void fillCrossword(String[] words, int i) {
        if (i == words.length){
            for (int x = 0; x < 10; x++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(grid[x][j]);
                }
                System.out.println();
            }
            return;
        }
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (grid[r][c]== '-' || grid[r][c] == words[i].charAt(0)){
                    if (CheckVertical(words,i,r,c)){
                        boolean cross[]={true,true,true,true,true,true,true,true,true,true};
                        setVertical(words,i,r,c,cross);

                        fillCrossword(words,i+1);

                        resetVertical(words,i,r,c,cross);

                    }
                    if (CheckHorizontal(words,i,r,c)){
                        boolean cross[]={true,true,true,true,true,true,true,true,true,true};
                        setHorizontal(words,i,r,c,cross);

                        fillCrossword(words,i+1);

                        resetHorizontal(words,i,r,c,cross);
                    }
                }
            }
        }
    }

    private static void setHorizontal(String[] words, int i, int r, int c, boolean[] cross) {
        for (int j = c; j < (c+words[i].length()); j++) {
            if (grid[r][j] != '-'){
                cross[j-c]= false;
            }
            grid[r][j] = words[i].charAt(j-c);
        }
    }

    private static void resetHorizontal(String[] words, int i, int r, int c, boolean[] cross) {
        for (int j = c; j < (c+words[i].length()); j++) {
            if (cross[j-c]){
                grid[r][j] = '-';
            }
        }
    }

    private static boolean CheckHorizontal(String[] words, int i, int r, int c) {
        for (int j = c; j < (c+words[i].length()); j++) {
            if (j==10)
                return false;
            else if (grid[r][j] == '+')
                return false;
            else if (grid[r][j] != '-')
                if (grid[r][j] != words[i].charAt(j-c))
                    return false;
        }
        return true;
    }

    private static void resetVertical(String[] words, int i, int r, int c, boolean[] cross) {
        for (int j = r; j < (r+words[i].length()); j++) {
            if (cross[j-r]){
                grid[j][c] = '-';
            }
        }
    }

    private static void setVertical(String[] words, int i, int r, int c, boolean[] cross) {
        for (int j = r; j < (r + words[i].length()); j++) {
            if (grid[j][c] != '-'){
                cross[j-r]= false;
            }
            grid[j][c] = words[i].charAt(j-r);
        }
    }
       private static boolean CheckVertical(String[] words, int i, int r, int c) {
        for (int j = r; j < (r+words[i].length()); j++) {
            if (j==10)
                return false;
            else if (grid[j][c]=='+')
                return false;
            else if (grid[j][c] != '-')
                if (grid[j][c] != words[i].charAt(j-r))
                    return false;
        }

        return true;
    }


}

