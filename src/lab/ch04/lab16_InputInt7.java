package lab.ch04;

import java.util.Scanner;

public class lab16_InputInt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=1;
        while(num<100){
            System.out.print("정수 한개를 입력하시오: ");
            num = scanner.nextInt();
            if(num == 0)
                continue;
            System.out.println(num);
        }

    }
}
