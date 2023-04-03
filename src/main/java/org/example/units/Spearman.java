package org.example.units;
import org.example.groups.CloseCombatGroup;

// Копейщик наследуется от CloseCombatGroup (+Атака)
public class Spearman extends CloseCombatGroup {

    public Spearman() {
        super("Светлые", 6, 6);
    }
    @Override
    public String getInfo() {
        return "Копейщик";
    }
}
