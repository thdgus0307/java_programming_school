package lab.ch02;

import java.util.Scanner;

public class lab02_ReadLine {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        System.out.print("문장을 입력하시오: ");
        str = scanner.nextLine();
        System.out.printf("입력한 문장은 \"%s\"\n", str);
    }
}
