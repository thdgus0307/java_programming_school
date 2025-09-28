package hw;

import java.util.Scanner;

class Student{
    int id;
    String name;
    String major;
    String number;

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setMajor(String major) {  this.major = major; }
    public String getMajor() {  return major; }
    public void setNumber(String number) { this.number = number.substring(1,11); }
    public String getNumber() { return number; }
}
public class Homework2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student1.setId(scanner.nextInt());
        student1.setName(scanner.next());
        student1.setMajor(scanner.next());
        student1.setNumber(scanner.next());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student2.setId(scanner.nextInt());
        student2.setName(scanner.next());
        student2.setMajor(scanner.next());
        student2.setNumber(scanner.next());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student3.setId(scanner.nextInt());
        student3.setName(scanner.next());
        student3.setMajor(scanner.next());
        student3.setNumber(scanner.next());

        System.out.println();
        System.out.println("입력된 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: "+student1.getId()+" "+student1.getName()+" "+student1.getMajor()+" "+"0"+student1.getNumber().substring(0,2)+"-"+student1.getNumber().substring(2,6)+"-"+student1.getNumber().substring(6,10));
        System.out.println("두번째 학생: "+student2.getId()+" "+student2.getName()+" "+student2.getMajor()+" "+"0"+student2.getNumber().substring(0,2)+"-"+student2.getNumber().substring(2,6)+"-"+student2.getNumber().substring(6,10));
        System.out.println("세번째 학생: "+student3.getId()+" "+student3.getName()+" "+student3.getMajor()+" "+"0"+student3.getNumber().substring(0,2)+"-"+student3.getNumber().substring(2,6)+"-"+student3.getNumber().substring(6,10));



    }
}
