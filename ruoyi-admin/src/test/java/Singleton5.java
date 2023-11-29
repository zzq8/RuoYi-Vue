public class Singleton5 {
    /**
     * 说白了，就是在上面的基础上加 synchronized
     */
    static Singleton5 instance;
    private Singleton5() {}
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
                return instance;
            }
        }
        return instance;
    }
}