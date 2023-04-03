package org.example.units;
import org.example.groups.MagicianGroup;

/**Маг наследуется от MagicianGroup (+Лечение) (+Атака)
 */
public class Mag extends MagicianGroup {
    int attack;

    public Mag() {
        super("Тёмные",  -6, -6);
        attack = 1;
        treatment = 2;
    }
    @Override
    public String getInfo() {
        return "Маг";
    }
}
