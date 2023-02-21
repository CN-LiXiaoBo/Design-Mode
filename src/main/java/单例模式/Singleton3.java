package 单例模式;

/**
 * TODO
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 14:16
 */
public class Singleton3 {
    private Singleton3(){};

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
