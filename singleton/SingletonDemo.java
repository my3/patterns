public class SingletonDemo {

    public static void main(String[] args) {
        Singleton demo = Singleton.getLazyInstance();
        demo.sayHelloLazy();

        demo = Singleton.getLazyInstance();
        demo.sayHelloLazy();
    }
}