package 原型模式;

/**
 * TODO
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 21:01
 */
public class Prototype implements Cloneable{

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = p1.clone();

        System.out.println(p1 == p2);
    }
}
