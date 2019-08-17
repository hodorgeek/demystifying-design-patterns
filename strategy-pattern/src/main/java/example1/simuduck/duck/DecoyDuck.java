package example1.simuduck.duck;

import example1.simuduck.fly.FlyNoWay;
import example1.simuduck.quack.MuteDuck;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteDuck();
    }

    @Override
    public void display() {
        System.out.println("Wooden decoy duck");
    }
}
