package lecture.mid;

import java.util.Scanner;

public class Input7
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.print("정수를 하나 입력하시오: ");
            num = scanner.nextInt();
            if(num >= 100)
                break;
            else if (num != 0){
                System.out.println(num);
            }
        }while(num == 0);

    }
}
