package lecture;

public class ShapeAreaAndPerimeter {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];

        shapes[0] = new ARectangle(100,50);
        shapes[1] = new ACircle(50);

        for(AbstractShape shape : shapes) {
            if(shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.println();
            }
        }
    }

}
