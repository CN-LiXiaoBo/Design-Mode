package 单例模式;

/**
 * 饿汉式
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 13:58
 */
public class Singleton {

    //私有构造器
    private Singleton() {}

    //声明instance
    private static Singleton instance = new Singleton();

    //对外提供方法
    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
