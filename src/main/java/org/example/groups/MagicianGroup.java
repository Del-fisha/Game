package org.example.groups;

import org.example.BaseHero;

//Класс мага и монаха (+ лечение)
public abstract class MagicianGroup extends BaseHero {
    protected int treatment; //Количество возвращаемого Hp


    public MagicianGroup(String species,int coordX, int coordY) {
        super(species,100, 100, coordX, coordY, 5, new int[]{1, 8});
        treatment = 2;
    }
   @Override
    public void step() {
       System.out.println("MG step");
}

    @Override
    public String getInfo() {return null;}
}
