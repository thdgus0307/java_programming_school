package lab.ch04;

import java.util.Scanner;

public class lab21_Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int max, min;
        Integer arr[] = new Integer[10];
        System.out.print("몇개의 수를 입력할 예정인가요?");
        count = scanner.nextInt();

        System.out.print("수를 입렵하시오: ");
        for (int i =0; i<count;i++){
            arr[i] = scanner.nextInt();
        }
        max = arr[0];
        min = arr[0];

        for(int i =1; i<count; i++){
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
        }
        System.out.printf("최대값: %d, 최소값: %d\n", max, min);

    }
}
