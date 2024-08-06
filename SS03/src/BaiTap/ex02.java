package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        array = new int[]{10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Input elements you want to add:");
        int X = Integer.parseInt(sc.nextLine());
        System.out.println("Input index location you want to add:");
        int index = Integer.parseInt(sc.nextLine());
      if(index < -1 && index >= array.length-1){
          System.out.println("Invalid index");
      } else {
          int[] newArray = new int[array.length];
          for (int i = 0; i < array.length -1; i++) {
              if (i < index) {
                  newArray[i] = array[i];
              } else if (i == index) {
                  newArray[i] = X;
              } else {
                  newArray[i] = array[i-1];
              }
          }
          System.out.println(Arrays.toString(newArray));
      }
    }
}
