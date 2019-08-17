package example1.simuduck.quack;

/**
 * Quacks that make no sound at all
 */
public class MuteDuck implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing: can't quack
        System.out.println("<< Silence >>");
    }
}
