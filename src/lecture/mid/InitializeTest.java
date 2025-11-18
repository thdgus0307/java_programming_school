package lecture.mid;

public class InitializeTest {
    String s; // 멤버변수라서 null로 초기화됨.

    void printString(){
        System.out.println(s);
    }
    public static void main(String[] args) {
        InitializeTest s = new InitializeTest();
        s.printString();
    }
}
