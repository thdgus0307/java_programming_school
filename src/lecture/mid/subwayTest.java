package lecture.mid;

class Subway{
    int number;
    void run(){
        System.out.println("Line "+number+" runs.");
    }
    void setLine(int l){
        number =l;
    }
}
public class subwayTest {
    public static void main(String[] args) {
        Subway subway = new Subway();
        subway.setLine(3);
        subway.run();
    }
}
