package org.example.units;
import org.example.groups.CloseCombatGroup;

// Орк наследуется от CloseCombatGroup (+Атака)
public class Orc extends CloseCombatGroup {
    public Orc(String name) {
        super(name, "Тёмные", -6, -6);
    }
}
