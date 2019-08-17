package example1.simuduck.duck;

import example1.simuduck.fly.FlyBehavior;
import example1.simuduck.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    // Each duck has reference to something that implements the Quack behavior.
    protected QuackBehavior quackBehavior;

    /**
     * Rather than handling the quack behavior itself; the Duck object delegates
     * that behavior to the object referenced by quackBehavior.
     */
    public void performQuack(){
        // delegates to quack Behavior class
        quackBehavior.quack();
    }

    public void performFly() {
        // delegates to fly Behavior class
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
