package org.example.units;
import org.example.groups.RangedCombatGroup;

// Лучник наследуется от RangedCombatGroup (+Атака) (+Двойной удар)
public class Archer extends RangedCombatGroup {

    public Archer(String name) {
        super(name, "Тёмные", -6,-6);
        attack = 4;
        arrows = 10;
        accuracy = 7;
    }
}
