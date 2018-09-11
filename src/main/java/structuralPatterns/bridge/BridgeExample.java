package structuralPatterns.bridge;

public class BridgeExample {

    public static void main(String[] args) {
        Something me = new Do("днло",new СделатьДело());
        me.сделать();
    }

}
