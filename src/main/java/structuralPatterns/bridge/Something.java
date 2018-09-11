package structuralPatterns.bridge;

public abstract class Something {
    protected НекотороеАПИ некотороеАПИ;

    protected Something(НекотороеАПИ некотороеАПИ){
        this.некотороеАПИ = некотороеАПИ;
    }

    public abstract void сделать();
}
