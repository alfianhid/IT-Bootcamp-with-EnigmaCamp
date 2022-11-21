package com.enigma.java.oop;

public class Monster {

    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void receiveDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
