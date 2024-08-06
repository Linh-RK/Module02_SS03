package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array 1:");
        int size1=Integer.parseInt(sc.nextLine());
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Input element "+i+" of array 1:");
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Input size of array 2:");
        int size2 =Integer.parseInt(sc.nextLine());
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Input element "+i+"of array 2:");
            array2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Array 1 is: "+Arrays.toString(array1));
        System.out.println("Array 2 is: "+Arrays.toString(array2));
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < array1.length + array2.length; i++) {
            if (i<array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i-size1];
            }
        }
        System.out.println("Array 3 is: "+ Arrays.toString(array3));
    }
}
