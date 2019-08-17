package example1.simuduck;

import example1.simuduck.duck.Duck;
import example1.simuduck.duck.MallardDuck;
import example1.simuduck.duck.ModelDuck;
import example1.simuduck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
