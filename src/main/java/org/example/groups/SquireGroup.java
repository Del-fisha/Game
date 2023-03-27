package org.example.groups;

import org.example.BaseHero;

//Класс слуги и крестьянина (+ подача стрел)
public class SquireGroup extends BaseHero {

    protected int numberOfArrows; //Количество стрел


    public SquireGroup(String name, String species,int coordX, int coordY) {
        super(name, species, 90, 90, coordX, coordY, 2, new int[]{3, 10});
        numberOfArrows = 2;
    }
}

