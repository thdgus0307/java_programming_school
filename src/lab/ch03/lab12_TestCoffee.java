package lab.ch03;

class Coffee {
    String origin;
    int degreeOfRoast;
    String grade;
    Coffee(String o){origin =o;}
    Coffee(String o, String g){ origin=o; grade = g;}
    public void roast(int d){
        System.out.println("roasting..."+origin+" "+grade);
        degreeOfRoast =d;
    }
    public void grind(){
        System.out.println("grinding... degree of roast is"+degreeOfRoast);
    }
    public void brew(){
        System.out.println("brewing...");
    }
}
public class lab12_TestCoffee {
    public static void main(String[] args) {
        Coffee brazilCoffee = new Coffee("kenya","aa");
        brazilCoffee.roast(1);
        brazilCoffee.grind();
        brazilCoffee.brew();
    }
}
