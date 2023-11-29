import java.io.IOException;
import java.util.Properties;

/**
 * 可能想初始化一些变量，不要构造参数给值(这样要改代码不灵活)。。。是配置文件给值
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    static {
        try {
            Properties pro = new Properties();
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Singleton3(String info){
        this.info = info;
    }
}
