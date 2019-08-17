package example1.simuduck.fly;

/**
 * Here is the implementation of flying for all ducks that have wings
 */
public class FlyNoWay implements  FlyBehavior {
    @Override
    public void fly() {
        //do nothing : can't fly
        System.out.println("I can't fly");
    }
}
