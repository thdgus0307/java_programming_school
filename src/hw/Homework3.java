package hw;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr =new int[100];
        Scanner scanner = new Scanner(System.in);
        int max, min;
        int num;

        System.out.print("몇 개의 수를 입력할 예정인가요?");
        num = scanner.nextInt();

        System.out.print("수를 입력하세요:");
        for(int i = 0; i<num; i++){
            arr[i] = scanner.nextInt();
        }

        max = arr[0];
        min = arr[0];
        for(int i =1; i < num; i++){
            if(max < arr[i])
                max = arr[i];
            else if(min > arr[i])
                min = arr[i];
        }
        System.out.println("최댓값:"+max);
        System.out.println("최소값:"+min);
    }
}
