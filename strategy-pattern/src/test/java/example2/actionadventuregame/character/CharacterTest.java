package example2.actionadventuregame.character;

import example2.actionadventuregame.weapen.BowAndArrowBehavior;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testCharacterFight() {
        Character king = new King();
        king.fight();
        king.useWeapon();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
        king.useWeapon();
    }
}