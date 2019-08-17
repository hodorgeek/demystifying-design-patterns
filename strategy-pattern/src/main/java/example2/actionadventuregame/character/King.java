package example2.actionadventuregame.character;

import example2.actionadventuregame.weapen.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("I am king, I am fighting and ");
    }
}
