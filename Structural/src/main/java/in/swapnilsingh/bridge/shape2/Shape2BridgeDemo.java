package in.swapnilsingh.bridge.shape2;

public class Shape2BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCirle = new Circle(green);

        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCirle.applyColor();
        greenSquare.applyColor();
    }

}
