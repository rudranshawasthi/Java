package Coding_Ninjas.Backtracking;
/*
    Rat In A Maze Problem
        You are given a N*N maze with a rat placed at maze[0][0]. Find and print all paths that
        rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direction
        ( left, right, up and down).
        Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means
        rat can­not enter into those cells and those with value 1 are open.

    Input Format
        Line 1 : Integer N
        Next N Lines : Each line will contain ith row elements (separated by space)

    Output Format :
        One Line for every possible solution.
        Every line will have N*N maze elements printed row wise and are separated by space. Only cells
        that are part of solution path should be 1, rest all cells should be 0.

    Sample Input 1 :
        3
        1 0 1
        1 0 1
        1 1 1

    Sample Output 1 :
        1 0 0 1 0 0 1 1 1

    Sample Output 1 Explanation :
        Only 1 path is possible

    Sample Input 2 :
        3
        1 0 1
        1 1 1
        1 1 1

    Sample Output 2 :
        1 0 0 1 1 1 1 1 1
        1 0 0 1 0 0 1 1 1
        1 0 0 1 1 0 0 1 1
        1 0 0 1 1 1 0 0 1

    Sample Output 2 Explanation :
        4 paths are possible

 */

import java.util.Scanner;

public class Rat_In_A_Maze_Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = s.nextInt();
            }
        }
        ratInAMaze(maze);
    }

    static void printSolution(int[][] solution,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(solution[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void mazeHelp(int maze[][],int n,int[][] solution,int x,int y){
        if(x == n-1 && y == n-1){
            solution[x][y] =1;
            printSolution(solution,n);
            solution[x][y] =0;
            return;
        }
        if(x>=n || x<0 || y>=n || y<0 || maze[x][y] ==0 || solution[x][y] ==1){
            return;
        }
        solution[x][y] = 1;
        mazeHelp(maze,n,solution,x-1,y);
        mazeHelp(maze,n,solution,x+1,y);
        mazeHelp(maze,n,solution,x,y-1);
        mazeHelp(maze,n,solution,x,y+1);
        solution[x][y] = 0;
    }

    static void ratInAMaze(int maze[][]){
        int n = maze.length;
        int[][] solution = new int[n][n];
        for(int i=0;i<n;i++){
            solution[i] = new int[n];
        }
        mazeHelp(maze,n,solution,0,0);


    }

}
