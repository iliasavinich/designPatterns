package structuralPatterns.proxy;

import static java.lang.System.out;

public class ProxyPrinter implements Printer {

    private ConsolePrinter consolePrinter;

    public ProxyPrinter(String filename){
        consolePrinter = new ConsolePrinter(filename);
    }

    @Override
    public void print() {
        out.println("Print Method Invocation Start");
        consolePrinter.print();
        out.println("Print Method Invocation Finish");
    }

}
