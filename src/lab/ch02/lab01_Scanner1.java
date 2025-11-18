package lab.ch02;

import java.util.Scanner;

public class lab01_Scanner1 {
    public static void main(String[] args) {
        String str;
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하시오: ");
        str = scanner.next();
        System.out.print("정수 하나를 입력하시오: ");
        num = scanner.nextInt();
        System.out.printf("입력한 문자열은 %s, 정수는 %d\n", str, num);
    }
}
