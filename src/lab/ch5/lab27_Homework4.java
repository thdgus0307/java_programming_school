package lab.ch5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class lab27_Homework4 {
    int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int m,n;
        lab27_Homework4 s = new lab27_Homework4();
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        m = scanner.nextInt();;
        n = scanner.nextInt();

        if(m>n)
            System.out.println(s.gcd(m,n));
        else
            System.out.println(s.gcd(n,m));



    }
}
