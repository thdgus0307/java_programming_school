package lab.ch04;

class Student14{
    String name;
    double score;
    int income;

    Student14(String name, double score, int income){
        this.name = name;
        this.score = score;
        this.income = income;
    }
    public String getName() {return name;}
    public double getScore() {return score;}
    public int getIncome() {return income;}
}
public class lab14_TestStudent {
    public static void main(String[] args) {
        Student14 s1 = new Student14("김규상",4.1, 3);
        Student14 s2 = new Student14("김민재", 3.71, 5);
        Student14 s3 = new Student14("김용하", 3.93, 7);

        if(s1.getScore()>= 3.5 && s1.getIncome()<=5){
            System.out.printf("%s학생은 장학생 후보입니다\n", s1.getName());
        }
        if(s2.getScore()>= 3.5 && s2.getIncome()<=5){
            System.out.printf("%s학생은 장학생 후보입니다\n", s2.getName());
        }
        if(s3.getScore()>= 3.5 && s3.getIncome()<=5){
            System.out.printf("%s학생은 장학생 후보입니다\n", s3.getName());
        }
    }

}
