package structuralPatterns.facade;

public class ShapeFacade {
    private Shape circle, rectangle, square;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public  void drawSquare(){
        square.draw();
    }
}
