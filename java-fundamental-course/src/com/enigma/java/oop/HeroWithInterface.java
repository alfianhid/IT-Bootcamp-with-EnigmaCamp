package com.enigma.java.oop;

public class HeroWithInterface implements Hitable, AttackAble {

    private String name;
    private Integer hp;
    private Integer baseDamage;

    public HeroWithInterface(String name, Integer hp, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    @Override
    public void attack(Hitable hitable) {
        hitable.receiveDamage(this.baseDamage);
    }

    @Override
    public void receiveDamage(Integer baseDamage) {
        this.hp -= baseDamage;
    }
}
