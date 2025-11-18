package lecture;

class Point{
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){return x;}
    public int getY(){return y;}
    @Override
    public String toString() {
        String msg = "("+x+", "+y+")";
        return msg;
    }
}

class circle extends Point {
    private double radius;
    public circle(){}
    public circle(int x, int y, double r){
        super(x,y);
        this.radius = r;
    }
    public double getRadius(){return radius;}
    public double getCircumference(){return 2*Math.PI*radius;}
    public double getArea(){return Math.PI*radius*radius;}

}
public class TestCircle {
    public static void main(String[] args) {
        circle myCircle = new circle(10,10,5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.println(myArea);
        System.out.println(myCircumference);
    }
}
