package behavioralPatterns.visitor;

public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer(){
        computerParts = new ComputerPart[] {new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
