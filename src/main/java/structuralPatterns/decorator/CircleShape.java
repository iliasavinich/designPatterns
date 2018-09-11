package structuralPatterns.decorator;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
