package BaiTap;

import java.util.Scanner;

public class Quick {
//        2 số nguyen n1, n2, n2>n1
//    tổng lẻ từ n1 đến n2
//    hiển thị số nguyên tố từ n1, n2
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the first number n1:");
    int n1 = Integer.parseInt(sc.nextLine());
    int n2;
    do {
        System.out.println("Please enter the first number n2:");
         n2 = Integer.parseInt(sc.nextLine());
    } while ( n2 < n1);
    int sum = 0;
    for (int i = n1; i <=n2; i++) {
        if (i % 2 == 0) {
            continue;
        } else {
            sum +=i;
        }
    }
    System.out.println("Sum of odd form " + n1+ " to " + n2 + sum);
//    hiển thị số nguyên tố từ n1, n2

    for (int i = n1; i <=n2; i++) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(i);
        }
    }
}
}
