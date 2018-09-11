package structuralPatterns.proxy;

public class ProxyPrinter implements Printer {

    private ConsolePrinter consolePrinter;

    public ProxyPrinter(String filename){
        consolePrinter = new ConsolePrinter(filename);
    }

    @Override
    public void print() {
        consolePrinter.print();
    }

}
