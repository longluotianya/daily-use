import org.testng.Assert;
import org.testng.annotations.Test;

import builder.Car;
import builder.CarBuilder2;

/**
 * Builder设计模式，对应的博文https://www.jianshu.com/p/5521593d1448
 * Created by gouzhijun
 * on 2018/4/13
 */
public class BuilderTest {

    @Test
    public void testCarBuilder() {
        Car.CarBuilder builder = Car.getBuilder();
        builder.setName("Buck").setNo("京A52450");
        Car car = builder.build();
        Assert.assertEquals(car.getName(), "Buck");
        Assert.assertEquals(car.getNo(), "京A52450");
    }

    @Test
    public void testCarBuilder2() {
        CarBuilder2 builder2 = Car.getBuilder2();
        builder2.setName("Buck").setNo("京A52450");
        Car car = builder2.build();
        Assert.assertEquals(car.getName(), "Buck");
        Assert.assertEquals(car.getNo(), "京A52450");
    }


}
