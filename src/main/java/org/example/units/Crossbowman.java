package org.example.units;
import org.example.groups.RangedCombatGroup;

// Арбалетчик наследуется от RangedCombatGroup (+Атака) (+Двойной урон)
public class Crossbowman extends RangedCombatGroup {

    protected int doubleDamage;

    public Crossbowman(String name) {
        super(name, "Светлые", 6,6);
        doubleDamage = attack * 2;
        attack = 6;
        arrows = 7;
        accuracy = 10;
    }
}
