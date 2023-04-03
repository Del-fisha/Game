package org.example.groups;

import org.example.BaseHero;

//Класс лучника и арбалетчика (+ удар)
public abstract class RangedCombatGroup extends BaseHero {
    protected int attack; //Наносимый урон
    protected int arrows;
    protected int accuracy;

    public RangedCombatGroup(String species, int coordX, int coordY) {
        super(species, 100, 100, coordX, coordY, 5, new int[]{1, 8});
    }
    @Override
    public void step() {
        System.out.println("RC step");
    }

    @Override
    public String getInfo() {return null;}
}

