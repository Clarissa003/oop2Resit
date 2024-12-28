package com.nhlstenden.characters;

public abstract class Character
{
    private int attackPower;
    private int defense;
    private int damage;

    public Character(int attackPower, int defense, int damage)
    {
        this.attackPower = attackPower;
        this.defense = defense;
        this.damage = damage;
    }

    public int getAttackPower()
    {
        return attackPower;
    }

    public void setAttackPower(int attackPower)
    {
        this.attackPower = attackPower;
    }

    public int getDefense()
    {
        return defense;
    }

    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public void attack()
    {
        this.attackPower++;
    }

    public void defend()
    {
        this.defense++;
    }

    public abstract void useSpecialAbility();
}
