package BaiTap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
//        [Bài tập] Tìm phần tử lớn thứ 2 trong Mảng
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
//        Cách 1 : Dùng 2 vòng lặp for :
//        Bước 1: Đầu tiên chúng ta sẽ dùng vòng lặp for duyệt mảng tìm ra phần tử lớn nhất.
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int max2 = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max2 && arr[i] != max) {
//                max2 = arr[i];
//            }
//        }
//        System.out.println("The max is " + max);
//        System.out.println("The second max is " + max2);

//        Bước 2: Tiếp theo chúng ta dùng vòng lặp for thứ 2
//        duyệt mảng tìm phần tử lớn nhất trong các phần tử còn lại,
//                loại trừ phần tử lớn nhất trước đó.


//                Cách 2 : Dùng 1 vòng lặp for :
//        Bước 1: Khai báo một mảng số nguyên bất kì.
//        Bước 2: Chỉ sử dụng một vòng lặp duy nhất để tìm số lớn đứng thứ 2.
//        Sử dụng 2 biến trung gian max và max2. Suy nghĩ tư duy logic để giải quyết vấn đề.
        int max , max2;
        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        } else {
            max = arr[1];
            max2 = arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The second max is " + max2);
    }
}
