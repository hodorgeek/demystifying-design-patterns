package example1.simuduck.duck;

import example1.simuduck.fly.FlyWithWings;
import example1.simuduck.quack.Quack;
import example1.simuduck.quack.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("red head duck");
    }
}
