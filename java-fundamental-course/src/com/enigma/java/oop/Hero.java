package com.enigma.java.oop;

public class Hero {

    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Hero(String name, Integer hp, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public Hero() {}

    // this method can be attack other hero
    public void attack(Hero hero) {
        if(hero.hp > 0) {
            hero.getHilt(this.baseDamage);
        } else {
            System.out.println(hero.name + " dead");
        }
    }

    // this method is overloading
    public void attack(Monster monster) {
        monster.receiveDamage(this);
    }

    // this method can be minus hp other hero
    public void getHilt(Integer baseDamage) {
        this.hp = this.hp - baseDamage;
    }

    // this method can be get hp hero
    public void getHeal(int baseDamage) {
        this.hp = this.hp + baseDamage;
    }

    // this method can be give hp to hero
    public void cure(Hero hero) {
        hero.getHeal(this.baseDamage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Integer baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
