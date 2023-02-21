package 单例模式;

/**
 * 懒汉式
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 14:03
 */
public class Singleton2 {
    //私有构造器
    private Singleton2() {

        /**
         * 避免反射破解单例模式
         */
        if (instance != null){
            throw new RuntimeException();
        }
    }

    //声明instance
    private static volatile Singleton2 instance = null;

    //对外提供方法

    //双重检查锁
    public static Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }
}
