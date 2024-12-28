package com.nhlstenden.characters;

import com.nhlstenden.characters.Character;

public class Archer extends Character
{
    public Archer(int attackPower, int defense, int damage)
    {
        super(attackPower, defense, damage);
    }

    @Override
    public void useSpecialAbility()
    {
        int originalDamage = this.getDamage();
        this.setDamage(originalDamage * 2);
    }
}
