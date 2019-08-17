package example1.simuduck.duck;

import example1.simuduck.fly.FlyNoWay;
import example1.simuduck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}
