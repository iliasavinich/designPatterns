package creationalPatterns.factory;

public class ConcreteXmlWriter extends AbstractWriter {
    public void write(Object context) {
        System.out.println(new StringBuilder("Вызван класс: ").append(this.getClass().getName()));
    }
}
