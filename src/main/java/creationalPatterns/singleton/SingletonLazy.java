package creationalPatterns.singleton;

public class SingletonLazy {

    private static SingletonLazy _instance = null;

    private SingletonLazy(){
    }

    public static synchronized SingletonLazy getInstance(){
        if (_instance==null){
            _instance = new SingletonLazy();
        }
        return _instance;
    }
}
