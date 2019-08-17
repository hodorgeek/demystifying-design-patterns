package example1.simuduck.quack;

/**
 * Duck, Quacks that really quack.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // implements duck quacking
        System.out.println("Quack");
    }
}
