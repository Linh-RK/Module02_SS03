package BaiTap;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row of array:");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Input col of array:");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element: row" + i + " col" + j );
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int max = arr[0][0];
        int colMax =0;
        int rowMax =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println("Max element of array is " + max + "at row = "+  rowMax + " at col = "+  colMax);
    }
}
