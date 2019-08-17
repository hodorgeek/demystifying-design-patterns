package example1.simuduck.duck;

import example1.simuduck.fly.FlyRocketPowered;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {

    @Test
    public void testRedheadDuck() {
        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.setFlyBehavior(new FlyRocketPowered());
        redhead.performFly();
        redhead.performQuack();
    }
}