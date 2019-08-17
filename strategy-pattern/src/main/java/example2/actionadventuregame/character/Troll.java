package example2.actionadventuregame.character;

import example2.actionadventuregame.weapen.BowAndArrowBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("I am troll, I am fighting and ");
    }
}
