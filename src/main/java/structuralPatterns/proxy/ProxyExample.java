package structuralPatterns.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Printer printer = new ProxyPrinter("Lol");
        printer.print();
    }
}
