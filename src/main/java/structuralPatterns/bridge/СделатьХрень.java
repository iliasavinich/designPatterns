package structuralPatterns.bridge;


public class СделатьХрень implements НекотороеАПИ {

    @Override
    public void сделатьЧтоТо(String хрень){
        System.out.println("Поздравляю, вы сделали хрень "+хрень);
    }
}
