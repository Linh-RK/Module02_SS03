package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i +":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The array is:"+ Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum element of array is: "+ min);
    }
}
