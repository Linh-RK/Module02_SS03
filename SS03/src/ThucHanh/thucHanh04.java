package ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class thucHanh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[]{10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Input elements in array you want to delete:");
        int X = Integer.parseInt(sc.nextLine());
        int indexDelete = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                flag = true;
                indexDelete = i;
                break;
            }
        }
        System.out.println(indexDelete);
        System.out.println(array[indexDelete]);
        if (flag) {
            int[] array1 = new int[array.length];
            for (int j = 0; j < indexDelete; j++) {
                array1[j] = array[j];
            }
            for (int i = indexDelete; i < array.length -1; i++) {
                array1[i] = array[i +1];
            }
            array1[array.length -1] = 0;
            System.out.println(Arrays.toString(array1));

        } else {
            System.out.println("Not found element" + X + " in array");
        }
        }
    }

