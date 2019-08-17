package example2.actionadventuregame;

import example2.actionadventuregame.character.Character;
import example2.actionadventuregame.character.Troll;
import example2.actionadventuregame.weapen.KnifeBehavior;

public class ActionAdventureGame {
    public static void main(String[] args) {
        Character troll = new Troll();
        troll.fight();
        troll.useWeapon();

        troll.setWeaponBehavior(new KnifeBehavior());
        troll.fight();
        troll.useWeapon();
    }
}
