package org.example;

import java.util.Random;

public abstract class BaseHero implements GameInterface {
    String name;
    String species; //Расса
    float hp, maxHp;
    int coordX, coordY;
    int def;
    int[] damage;

    public BaseHero(String species, float hp, float maxHp, int coordX, int coordY, int def, int[] damage) {
        this.name = getName();
        this.hp = this.maxHp = maxHp;
        this.coordX = coordX;
        this.coordY = coordY;
        this.def = def;
        this.damage = damage;
        this.species = species;
    }
    public static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}
