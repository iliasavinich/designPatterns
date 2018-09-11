package creationalPatterns.factory;

public class ConcreteFileWriter extends AbstractWriter {
    public void write(Object context) {
        System.out.println(new StringBuilder("Вызван класс: ").append(this.getClass().getName()));
    }
}
