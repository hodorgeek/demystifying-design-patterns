package example1.simuduck.duck;

import example1.simuduck.fly.FlyNoWay;
import example1.simuduck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
