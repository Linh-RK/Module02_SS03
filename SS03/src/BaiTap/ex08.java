package BaiTap;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
//        [Bài tập] Đếm số lần xuất hiện của ký tự trong chuỗi
//        Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string:");
        String str = sc.nextLine();
//        Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.
        System.out.println("Please input a character:");
        char character = sc.nextLine().charAt(0);
//        Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;
//        Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi. Trong quá trình duyệt: so sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
//        Lưu ý:
//        Hàm str.length() trả về tổng số ký tự trong một chuỗi str
//        Hàm str.charAt(i) trả về ký tự ở vị trí thứ i trong chuỗi str
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Character " + character+ " repeat " +count+ " time");
//        Bước 5: In ra giá trị biến đếm.
    }
}
