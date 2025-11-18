package lab.ch04;

import java.util.Scanner;

public class lab15_MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String site;

        System.out.print("원하는 종류의 극장 좌석을 입력하시오:");
        site = scanner.nextLine();
        if(site.equals("prime"))
            System.out.println("프라임존 표 값은 11000원입니다.");
        else if(site.compareTo("standard") == 0)
            System.out.println("스탠다드존 표 값은 10000원입니다.");
        else if(site.equals("economy"))
            System.out.println("이코노미존 표 값은 9000원입니다.");
        else{
            System.out.println("좌석 종류를 잘못 입력하셨습니다.");
        }
    }
}
