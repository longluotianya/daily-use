package builder;

/**
 * Created by gouzhijun
 * on 2018/4/13
 */
public class Car {

    // 名称
    private String name;
    // 拍照
    private String no;

    private Car(String no, String name) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    // 返回Builder
    public static CarBuilder getBuilder () {
        return new CarBuilder();
    }

    // 返回Builder2
    public static CarBuilder2 getBuilder2() {
        return new CarBuilder2(Car::new);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                '}';
    }

    // 定义建造者，建造者的属性应该和car保持一致
    public static class CarBuilder {
        private String name;
        private String no;

        public CarBuilder() {

        }

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setNo(String no) {
            this.no = no;
            return this;
        }

        public Car build() {
            return new Car(this.no, this.name);
        }
    }

}
