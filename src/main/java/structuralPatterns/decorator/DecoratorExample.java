package structuralPatterns.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Shape circle = new CircleShape();
        Shape redCircle = new RedShapeDecorator(new CircleShape());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}

