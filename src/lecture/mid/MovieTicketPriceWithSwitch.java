package lecture.mid;

import java.util.Scanner;

public class MovieTicketPriceWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sit = "";

        System.out.print("prime,standard,economy중 한가지를 입력하시오:");
        sit = scanner.next();

        switch (sit){
            case "prime":
                System.out.println("프라임존 표 값은 11000원입니다.");
                break;
            case "standard":
                System.out.println("스탠타드존 표 값은 10000원입니다.");
                break;
            case "economy":
                System.out.println("이코노미 표 값은 9000원입니다.");
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다.");
                break;
        }
    }
}
