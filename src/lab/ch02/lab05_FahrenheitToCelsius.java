package lab.ch02;

import java.util.Scanner;

public class lab05_FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("화씨 온도를 입력하시오:");
        fahrenheit = scanner.nextDouble();

        celsius = ((double) 5/9)*(fahrenheit-32); // 5/9를 수학처럼 분수로 생각하면 안됨!

        System.out.printf("변환된 섭씨 온도는 %.1f", celsius);
    }
}
