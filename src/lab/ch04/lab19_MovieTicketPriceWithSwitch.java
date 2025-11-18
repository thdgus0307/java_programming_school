package lab.ch04;

import java.util.Scanner;

public class lab19_MovieTicketPriceWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sit;

        System.out.print("원하는 종류의 극장 좌석을 입력하시오: ");
        sit = scanner.nextLine();

        switch (sit)
        {
            case "economy":
                System.out.println(9000);
                break;
            case "standard":
                System.out.println(10000);
                break;
            case "prime":
                System.out.println(11000);
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다.");
                break;
        }

    }
}
