package example1.simuduck.duck;

import example1.simuduck.fly.FlyWithWings;
import example1.simuduck.quack.Quack;

public class MallardDuck extends Duck {

    /**
     * A mallardDuck uses quack class to handle its quack; so when performQuack()
     * is called, the responsibility for the quack is delegated to the Quack object
     * and we get a real quack.
     *  And it uses FlyWithWings as its FlyBehavior type.
     */
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
