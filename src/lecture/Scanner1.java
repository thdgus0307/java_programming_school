import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 공백단위로 문자를 인식함
        System.out.println("출력 문자열: "+ s);
        int num = sc.nextInt();
        System.out.println("출력 정수: "+ num);
    }
}
