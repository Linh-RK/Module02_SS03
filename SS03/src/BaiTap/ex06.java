package BaiTap;

import java.util.Random;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Bước 1: Khai báo 2 biến để nhập số dòng và số cột cho mảng 2 chiều từ bàn phím
        int row;
        int col;
        do {
            System.out.println("Please enter row of array: ");
            row = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter col of array: ");
            col = Integer.parseInt(scanner.nextLine());
            if (row <= 0 || col <= 0) {
                System.out.println("The value of row and col must be positive integer ! ");
            } else {
//
                break;
            }
        } while (true);
//        Bước 2: Khai báo 1 mảng 2 chiều với số dòng và cột ở trên và nhập từng giá trị cho mảng 2 chiều
        int[][] matrix = new int[row][col];
        Random r = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = r.nextInt(50);
            }
        }
//      Bước 3: Hiển thị các giá trị của mảng 2 chiều vừa nhập
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
                if (j == matrix[0].length - 1) {
                    System.out.println();
                }
            }
        }

//      Bước 4: Khai báo 1 biến y nhập từ bàn phím là số cột cần tính tổng ,
//      kiểm tra điều kiện số cột nhập không được nằm ngoài giá trị số cột của mảng 2 chiều hiện tại.
        int y = 0;
        do {
            System.out.println("Please enter a number of col you want to calculate sum: ");
            y = Integer.parseInt(scanner.nextLine());
            if (y <= 0 || y > col) {
                System.out.println("The value of col must be between 1 and" + col + "! ");
            } else
                break;
        }while (true);
//      Bước 5: Khai báo 1 biến sum với giá trị ban đầu bằng 0 để tính tổng . Duyệt lại từng phần tử của mảng 2 chiều kiểm tra điều kiện với giá trị cột của mảng 2 chiều = với giá trị cột cần tính thì cộng dồn giá trị các phần tử tại vị trí cột đó lại ( if(j == y - 1){ sum = sum + arr[i][j] } với i là dòng j là cột trong mảng còn y là vị trí cột vừa nhập yêu cầu tính tổng).
       int sum = 0;
       for (int i = 0; i < row; i++) {
       sum += matrix[i][y-1];
        }
        System.out.println("Sum of elements at col "+ y+ " is " +sum);
        }

    }

