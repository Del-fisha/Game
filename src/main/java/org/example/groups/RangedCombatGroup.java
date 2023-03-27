package org.example.groups;

import org.example.BaseHero;

//Класс лучника и арбалетчика (+ удар)
public class RangedCombatGroup extends BaseHero {
    protected int attack; //Наносимый урон
    protected int arrows;
    protected int accuracy;

    public RangedCombatGroup(String name, String species, int coordX, int coordY) {
        super(name, species, 100, 100, coordX, coordY, 5, new int[]{1, 8});
    }
}

