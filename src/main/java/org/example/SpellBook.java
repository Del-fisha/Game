package org.example;

public enum SpellBook {
    healOne(1, -1), healFive(2, -5), healTen(3, -10),

    damageOne(1,1), damageFive(2,5), damageTen(3,10),
    ressurect(25, Float.NaN);
    private final float power, cost;
    SpellBook(float cost, float power){
        this.power = power;
        this.cost = cost;
    }
    public float getPower(){return power;}
    public float getCost() {return cost;}
}
