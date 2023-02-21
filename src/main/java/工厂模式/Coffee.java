package 工厂模式;

/**
 * TODO
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 20:04
 */

//抽象产品
public abstract class Coffee {
    private String coffeeName;
    public String getName(){
        return coffeeName;
    }
}

//具体产品
class AmeriCoffee extends Coffee{
    @Override
    public String getName() {
        return "美式咖啡";
    }
}
class LatterCoffee extends Coffee{
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}

// 抽象工厂
interface CoffeeFactory{
    Coffee createCoffee();
}

//具体工厂
class AmeriCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmeriCoffee();
    }
}

class LattCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
