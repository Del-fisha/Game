package org.example.groups;

import org.example.BaseHero;

//Класс мага и монаха (+ лечение)
public class MagicianGroup extends BaseHero {
    protected int treatment; //Количество возвращаемого Hp


    public MagicianGroup(String name, String species,int coordX, int coordY) {
        super(name, species,100, 100, coordX, coordY, 5, new int[]{1, 8});
        treatment = 2;
    }
}
