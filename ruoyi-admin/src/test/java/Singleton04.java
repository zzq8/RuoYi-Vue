public class Singleton04 {
    private static Singleton04 INSTANCE;
    private Singleton04(){}

    public static Singleton04 getSingleton(){
        if (INSTANCE==null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }
}
