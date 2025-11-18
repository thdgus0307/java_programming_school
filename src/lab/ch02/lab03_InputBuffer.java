package lab.ch02;

import java.util.Scanner;

public class lab03_InputBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("첫 번째 문자열: "+s);
        int n = scanner.nextInt();
        System.out.println("출력 정수: "+n);
        String s1 = scanner.nextLine();
        System.out.println("나머지 문자열: "+s1);

    }
}
