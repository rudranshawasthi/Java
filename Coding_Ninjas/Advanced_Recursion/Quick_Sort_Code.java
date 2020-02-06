package Coding_Ninjas.Advanced_Recursion;

import java.util.Scanner;

public class Quick_Sort_Code {
    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
    public static void quickSort(int[] input){
        quickSort(input,0,input.length-1);
    }
    public static void quickSort(int[] input,int startingIndex,int endIndex){
        if(endIndex <= startingIndex){
            return;
        }
        int partitionIndex = partition(input,startingIndex,endIndex);
        quickSort(input,startingIndex,partitionIndex-1);
        quickSort(input,partitionIndex,endIndex);

    }
    public static int partition(int[] input, int startIndex, int endIndex){
        int piviot = input[startIndex];
        int count = 0;
        for (int i = startIndex; i < endIndex; i++)
        {
            if (input[i] <= piviot)
            {
                count++;
            }
        }
        int piviotIndex = startIndex + count;
        input[startIndex] = input[piviotIndex];
        input[piviotIndex] = piviot;

        int i = startIndex, j = endIndex;
        while (i < j) {
            while (i < endIndex && input[i] <= piviot) {
                i++;
            }
            while (input[j] > piviot) {
                j--;
            }
            if (i <= j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return piviotIndex;
    }
}