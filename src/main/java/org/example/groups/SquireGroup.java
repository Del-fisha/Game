package org.example.groups;

import org.example.BaseHero;

//Класс слуги и крестьянина (+ подача стрел)
public abstract class SquireGroup extends BaseHero {

    protected int numberOfArrows; //Количество стрел


    public SquireGroup(String species,int coordX, int coordY) {
        super(species, 90, 90, coordX, coordY, 2, new int[]{3, 10});
        numberOfArrows = 2;
    }
    @Override
    public void step() {
        System.out.println("SG step");
    }

    @Override
    public String getInfo() {return null;}
}

