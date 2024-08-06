package ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class thucHanh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        [Thực Hành] Đảo ngược các phần tử của mảng
    int size;
    int[] array;
    do{
        System.out.println("Enter the size of the array");
        size = Integer.parseInt(sc.nextLine());
        if (size > 20){
            System.out.println("Size must be less than 20");
        }
    }
    while (size > 20);
    array = new int[size];
    for (int i = 0; i < size; i++) {
        System.out.println("Please input element " + i + ":");
        array[i] = Integer.parseInt(sc.nextLine());
    }
        System.out.println(Arrays.toString(array));
    for (int i = 0; i <= array.length/2; i++) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(array));
    }
}
