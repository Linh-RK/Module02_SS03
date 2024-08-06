package BaiTap;

import java.util.Random;
import java.util.Scanner;
//[Bài tập] Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bước 1: Khai báo 1 biến để nhập số dòng và số cột cho mảng 2 chiều
//        từ bàn phím là ma trận vuông có số dòng số cột bằng nhau
        int size ;
        do {
            System.out.println("Please enter row and col of array: ");
            size = Integer.parseInt(sc.nextLine());
            if (size <= 0) {
                System.out.println("The value of row and col must be positive integer ! ");
            } else {
                break;
            }
        } while (true);
//        Bước 2: Khai báo 1 mảng 2 chiều là ma trận vuông và nhập từng giá trị cho ma trận
        int[][] matrix = new int[size][size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = r.nextInt(100);
            }
        }
//        Bước 3: Hiển thị các giá trị của ma trận vừa nhập
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
                if (j == matrix.length - 1) {
                    System.out.println();
                }
            }
        }
//        Bước 4: Duyệt các phần tử của ma trận vuông
//        Đường chéo chính trong ma trận vuông là đường chéo có số dòng và số cột bằng nhau
//        kiểm tra điều kiện if(i == j ){sum1 + = arr[ i ][ j ]}
//        khi số dòng bằng số cột thì cộng dồn các giá trị của phần tử ở vị trí đó
//        vào biến sum1 được tổng của đường chéo chính
//        Đường chéo phụ trong ma trận vuông ta kiểm tra điều kiện
//        diagonal of a square matrix
        int sumMainDiagonal = 0, sumSubDiagonal = 0;
        for (int i = 0; i < size; i++) {
            sumMainDiagonal += matrix[i][i];
        }
        for (int i = 0; i < size; i++) {
            sumSubDiagonal += matrix[i][size-1-i];
        }
        System.out.println("Sum of element at main diagonal: " + sumMainDiagonal);
        System.out.println("Sum of element at sub diagonal: " + sumSubDiagonal);
//        if(j == arr.length - 1 - i ){sum2 + = arr[ i ][ j ]}
//        (chỉ số cột giảm dần khi chỉ số hàng tăng dần),
//        thì cộng giá trị của phần tử tại vị trí đó vào biến sum2
//        ta được tổng các giá trị của đường chéo phụ.
    }
}
