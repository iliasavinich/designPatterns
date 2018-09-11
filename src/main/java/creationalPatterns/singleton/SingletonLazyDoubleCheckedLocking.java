package creationalPatterns.singleton;

public class SingletonLazyDoubleCheckedLocking {
    private static volatile SingletonLazyDoubleCheckedLocking instance;

    private SingletonLazyDoubleCheckedLocking(){

    }
    public static SingletonLazyDoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (SingletonLazyDoubleCheckedLocking.class){
                if (instance == null){
                    instance = new SingletonLazyDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
