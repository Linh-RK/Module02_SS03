package ThucHanh;

import java.util.Scanner;

public class thucHanh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter student name: ");
        String nameCheck = sc.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameCheck)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("Position of student "+ students[index] + " is "+ index); ;
        } else {
            System.out.println("Not found student "+ nameCheck +"in the list");
        }
    }
}
