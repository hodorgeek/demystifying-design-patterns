package example1.simuduck.quack;

/**
 * Duck that squeak
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        // rubber duckies squeak
        System.out.println("squeak");
    }
}
