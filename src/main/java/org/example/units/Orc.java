package org.example.units;
import org.example.groups.CloseCombatGroup;

// Орк наследуется от CloseCombatGroup (+Атака)
public class Orc extends CloseCombatGroup {
    public Orc() {
        super("Тёмные", -6, -6);
    }
    @Override
    public String getInfo() {
        return "Орк";
    }
}
