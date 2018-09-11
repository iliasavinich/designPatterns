package structuralPatterns.proxy;

public class ConsolePrinter implements Printer {
    private String filename;

    public ConsolePrinter(String filename){
        this.filename = filename;
    }


    @Override
    public void print() {
        System.out.println(filename);
    }
}
