package lecture.mid;

class Coffee{
    String origin;
    int degreeOfRoast;
    String grade;
    Coffee(String o) {
        origin = o;
    }
    Coffee(String o, String g){
        origin = o;
        grade = g;
    }
    public void roast(int d){
        System.out.println("roasting... "+origin+" "+grade);
        degreeOfRoast = d;
    }
    public void grind(){
        System.out.println("grinding...degree of roast is "+ degreeOfRoast);
    }
    public void brew(){
        System.out.println("brewing...");
    }
}
public class coffeeTest {
    public static void main(String[] args) {
        Coffee brawilCoffee = new Coffee("kenya","AA");
        brawilCoffee.roast(1);
        brawilCoffee.grind();
        brawilCoffee.brew();
    }
}
