package example2.actionadventuregame.character;

import example2.actionadventuregame.weapen.AxeBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("I am kight, I am fighting and ");
    }
}
