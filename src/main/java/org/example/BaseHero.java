package org.example;

public abstract class BaseHero {
    String name;
    String species; //Расса
    float hp, maxHp;
    int coordX, coordY;
    int def;
    int[] damage;
    public BaseHero(String name, String species, float hp, float maxHp, int coordX, int coordY, int def, int[] damage){
        this.name = name;
        this.hp = this.maxHp = maxHp;
        this.coordX = coordX;
        this.coordY = coordY;
        this.def = def;
        this.damage = damage;
        this.species = species;
    }

}
