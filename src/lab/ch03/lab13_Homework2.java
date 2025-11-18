package lab.ch03;


import java.util.Scanner;

class Student13 {
    int id;
    String name;
    String major;
    int phone;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {   return name;    }

    public void setName(String name) {this.name = name;}

    public String getMajor() {return major;}

    public void setMajor(String major) {this.major = major;}

    public int getPhone() {return phone;}

    public void setPhone(int phone) {this.phone = phone;}

}
public class lab13_Homework2 {
    public static void main(String[] args) {
        Student13 s1 = new Student13();
        Student13 s2 = new Student13();
        Student13 s3 = new Student13();

        Scanner scanner =new Scanner(System.in);

        System.out.print("학번 이름 전공 전화번호를 입력하시오:");
        s1.setId(scanner.nextInt());
        s1.setName(scanner.next());
        s1.setMajor(scanner.next());
        s1.setPhone(scanner.nextInt());

        System.out.print("학번 이름 전공 전화번호를 입력하시오:");
        s2.setId(scanner.nextInt());
        s2.setName(scanner.next());
        s2.setMajor(scanner.next());
        s2.setPhone(scanner.nextInt());

        System.out.print("학번 이름 전공 전화번호를 입력하시오:");
        s3.setId(scanner.nextInt());
        s3.setName(scanner.next());
        s3.setMajor(scanner.next());
        s3.setPhone(scanner.nextInt());

        String num1 = Integer.toString(s1.getPhone());
        String num2 = Integer.toString(s2.getPhone());
        String num3 = Integer.toString(s3.getPhone());

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " +s1.getId() +" "+s1.getName() +" "+s1.getMajor()+" "+ "0"+ num1.substring(0,2)+"-"+num1.substring(2,6)+"-"+num1.substring(6));
        System.out.println("첫번째 학생: " +s2.getId() +" "+s2.getName() +" "+s2.getMajor()+" "+ "0"+ num2.substring(0,2)+"-"+num2.substring(2,6)+"-"+num2.substring(6));
        System.out.println("첫번째 학생: " +s3.getId() +" "+s3.getName() +" "+s3.getMajor()+" "+ "0"+ num3.substring(0,2)+"-"+num3.substring(2,6)+"-"+num3.substring(6));

    }

}
