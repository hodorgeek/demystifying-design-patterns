package example2.actionadventuregame.character;

import example1.simuduck.quack.Quack;
import example2.actionadventuregame.weapen.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("I am queen, I am fighting and ");
    }
}
