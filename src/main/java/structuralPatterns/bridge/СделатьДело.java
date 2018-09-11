package structuralPatterns.bridge;

public class СделатьДело implements НекотороеАПИ {
    @Override
    public void сделатьЧтоТо(String дело) {
        System.out.println("Сделал ".concat(дело)+" - гуляй смело");
    }
}
