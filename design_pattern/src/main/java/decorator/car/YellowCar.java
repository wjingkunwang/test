package decorator.car;

/**
 * Created by wjk on 16/7/9.
 */

public class YellowCar extends Decorator {

    public YellowCar(Car car) {
        super(car);
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("黄色");
    }
}
