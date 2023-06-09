package org.example.units;
import org.example.groups.SquireGroup;

// Крестьянин наследуется от SquireGroup (+Поднос стрел) (+Атака)
public class Peasant extends SquireGroup {
    protected int attack;
    public Peasant() {
        super("Светлые", 6, 6);
        attack = 1;
    }
    @Override
    public String getInfo() {
        return "Крестьянин";
    }
}
