package lab.ch5;

import java.util.Scanner;

public class lab23_NumLessThan100 {
    int value;
    lab23_NumLessThan100(int value){
        this.value = value;
    }
    boolean NumLessThan100(){
        return value < 100? true:false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 하나를 입력하시오: ");
        lab23_NumLessThan100 lab23NumLessThan100 = new lab23_NumLessThan100(scanner.nextInt());

        System.out.println(lab23NumLessThan100.NumLessThan100());

    }
}
