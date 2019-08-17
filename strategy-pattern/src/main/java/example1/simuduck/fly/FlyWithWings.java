package example1.simuduck.fly;

/**
 * Here is the implementation of flying for all ducks that have wings!
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        // implements duck flying
        System.out.println("I am flying!!");
    }
}
