package lecture.mid;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("prime,standard,economy중 한가지를 입력하시오:");
        String zone = scanner.next();

        if(zone.compareTo("prime")==0){
            System.out.println("프라임존 표 값은 11000원입니다.");
        }
        else if(zone.compareTo("standard")==0){
            System.out.println("스탠타드존 표 값은 10000원입니다.");
        }
        else if(zone.compareTo("economy")==0){
            System.out.println("이코노미 표 값은 9000원입니다.");
        }
        else {
            System.out.println("좌석 종류를 잘못 입력했습니다.");
        }
    }
}
