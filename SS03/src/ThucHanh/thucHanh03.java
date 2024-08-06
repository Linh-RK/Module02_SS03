package ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class thucHanh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        int max;
        int index = 0;
        do{
            System.out.print("Enter the size of the array: ");
            size = Integer.parseInt(sc.nextLine());
            if(size >20){
                System.out.println("The size of the array must be less than 20.");
            }
        }while (size>20);
        array = new int[size];
        max = array[0];
        for (int i = 0; i < size; i++) {
            System.out.println("Input the element" + i+ ":");
            array[i] =Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(array));

        for(int j = 0; j < size; j++){
            if(array[j] > max){
                max = array[j];
                index = j;
            }
        }
        System.out.println("Max element is: " + max + "at position "+ index);
    }
}
