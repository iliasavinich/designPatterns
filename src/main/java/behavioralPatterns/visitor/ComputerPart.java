package behavioralPatterns.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
