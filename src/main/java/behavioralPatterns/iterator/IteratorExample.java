package behavioralPatterns.iterator;


public class IteratorExample {
    public static void main(String[] args) {
        NameRepository<String> nameRepository = new NameRepository<>("Robert" , "John" ,"Julie" , "Lora");
        for (String s : nameRepository) {
            System.out.println("Name : " + s);
        }
    }
}
