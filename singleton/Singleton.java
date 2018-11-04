public class Singleton {
    /* 
       This is thread-safe, but we are creating at startup
       and not just when we need it. This can slowdown and 
       and add to start time.
    */
    private static Singleton uniqueEagerly = new Singleton();
    private static Singleton uniqueLazy;
    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueEagerly;
    }

    /*
        Lock only when object is null
    */
    public static Singleton getLazyInstance() {
        if(uniqueLazy == null) {
            synchronized(Singleton.class) {
                if(uniqueLazy == null) {
                    uniqueLazy = new Singleton();
                }
            }  
        }
        return uniqueLazy;
    }

    public void sayHelloLazy() {
        System.out.println("Hello from: "+Singleton.uniqueLazy);
    }
}