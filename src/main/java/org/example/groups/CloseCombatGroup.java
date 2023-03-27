package org.example.groups;

import org.example.BaseHero;

// Класс орка и копейщика (+ удар)
public class CloseCombatGroup extends BaseHero {
    protected int attack; //Наносимый урон

    public CloseCombatGroup(String name, String species,int coordX, int coordY) {
        super(name, species, 100, 100, coordX, coordY, 8, new int[]{1,3});
        attack = 4;
    }
}
