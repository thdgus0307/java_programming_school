package lab.ch5;

class Sum1 {
    int sum = 0;
    int getSum() {return sum;}
    int add(int num) {
        if (num <= 50) {
            return sum;
        } else if (num > 100) {
            sum += num;
        }
        printSum();
        return sum;
    }
    void printSum(){
        System.out.println(getSum());
    }


}
public class lab24_TestSum1 {
    public static void main(String[] args) {
        Sum1 s = new Sum1();
        s.add(101);
        s.add(51);
        s.add(50);
        s.printSum();
    }
}
