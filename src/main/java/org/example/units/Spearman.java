package org.example.units;
import org.example.groups.CloseCombatGroup;

// Копейщик наследуется от CloseCombatGroup (+Атака)
public class Spearman extends CloseCombatGroup {

    public Spearman(String name) {
        super(name, "Светлые", 6, 6);
    }
}
