package builder;

import java.util.function.BiFunction;

/**
 * Created by gouzhijun
 * on 2018/4/13
 */
public class CarBuilder2 {
    private BiFunction<String, String, Car> builder;

    private String name;
    private String no;

    public CarBuilder2(BiFunction<String,String,Car> builder) {
        this.builder = builder;
    }

    public String getName() {
        return name;
    }

    public CarBuilder2 setName(String name) {
        this.name = name;
        return this;
    }

    public String getNo() {
        return no;
    }

    public CarBuilder2 setNo(String no) {
        this.no = no;
        return this;
    }

    public Car build() {
        return builder.apply(no, name);
    }
}
