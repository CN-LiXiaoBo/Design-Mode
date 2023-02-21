package 建造者模式;

/**
 * TODO
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/21 16:20
 */
public class Phone {
    private String name;
    private String screen;
    private int price;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", screen='" + screen + '\'' +
                ", price=" + price +
                '}';
    }

    //私有构造器
    private Phone(Builder builder){
        this.name = builder.name;
        this.screen = builder.screen;
        this.price = builder.price;
    }
    public static final class Builder{
        private String name;
        private String screen;
        private int price;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder screen(String name){
            this.screen = name;
            return this;
        }
        public Builder price(int price){
            this.price = price;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .name("三星")
                .screen("1060")
                .price(100)
                .build();
        System.out.println(phone);
    }
}
