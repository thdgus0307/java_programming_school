package lab.ch03;

class Subway11{
    int line;
    void setLine(int line){
        this.line = line;
    }
    void run(){
        System.out.printf("Line %d rus\n", line);
    }
}
public class lab11_SubwayTest {
    public static void main(String[] args) {
        Subway11 s = new Subway11();
        s.run();
        s.setLine(3);
        s.run();
    }
}
