package lab.ch5;

import java.util.Scanner;

class PrintNumInRange{
    int value;
    Scanner scanner;
    PrintNumInRange(Scanner scanner) {this.scanner =scanner;}
    boolean isInRange(int min, int max){
        return (value >= min && value <= max) ? true : false;
    }
    void printInt() {
        System.out.println(value);
    }
    void readInt(){
        System.out.print("정수를 입력하세요: ");
        value = scanner.nextInt();
    }
}
public class lab22_TestPrintNumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintNumInRange printNumInRange = new PrintNumInRange(scanner);
        printNumInRange.readInt();
        if(printNumInRange.isInRange(1,100))
            printNumInRange.printInt();
        else
            System.out.println("1~100범위 밖 정수가 입력되었습니다.");
    }
}
