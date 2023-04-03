package org.example.groups;

import org.example.BaseHero;

// Класс орка и копейщика (+ удар)
public abstract class CloseCombatGroup extends BaseHero {
    protected int attack; //Наносимый урон

    public CloseCombatGroup(String species,int coordX, int coordY) {
        super(species, 100, 100, coordX, coordY, 8, new int[]{1,3});
        attack = 4;
    }
    @Override
    public void step() {
        System.out.println("CC step");
    }

    @Override
    public String getInfo() {return null;}
}
