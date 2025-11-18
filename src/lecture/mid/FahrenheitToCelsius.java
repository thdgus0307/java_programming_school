package lecture.mid;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit;
        float celsius;

        System.out.print("화씨 온도를 입력하시오: ");
        fahrenheit = sc.nextFloat();

        celsius = ((float)5/9)*(fahrenheit -32); // 5/9가 정수가 아니라 실수여야함

        System.out.printf("섭씨 온도: %.1f\n", celsius);

    }
}
