package behavioralPatterns.observer;

public class ObserverExample {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
