package 建造者模式;

import java.util.Locale;

/**
 * 指挥者
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/21 16:12
 */

//指挥者
public class Director {
    private BikeBuilder builder;
    public Director(BikeBuilder builder){
        this.builder = builder;
    }
    public Bike construct(){
        builder.builderName();
        builder.buildPrice();
        return builder.createBike();
    }
}
//产品
class Bike{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

//抽象建造者
abstract class BikeBuilder{
    protected Bike bike = new Bike();
    public abstract void builderName();
    public abstract void buildPrice();
    public abstract Bike createBike();
}

//具体建造者
class MoBikeBuilder extends BikeBuilder{

    @Override
    public void builderName() {
        bike.setName("摩拜");
    }

    @Override
    public void buildPrice() {
        bike.setPrice(100);
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
