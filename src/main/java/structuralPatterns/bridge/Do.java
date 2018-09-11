package structuralPatterns.bridge;

public class Do extends Something {

    private String чтоТо;

    public Do(String чтоТо,НекотороеАПИ некотороеАПИ){
        super(некотороеАПИ);
        this.чтоТо = чтоТо;

    }
    @Override
    public void сделать() {
        некотороеАПИ.сделатьЧтоТо(чтоТо);
    }
}
