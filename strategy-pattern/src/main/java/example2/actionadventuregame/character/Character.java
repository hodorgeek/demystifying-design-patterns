package example2.actionadventuregame.character;

import example2.actionadventuregame.weapen.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
