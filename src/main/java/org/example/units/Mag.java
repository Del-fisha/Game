package org.example.units;
import org.example.groups.MagicianGroup;

/**Маг наследуется от MagicianGroup (+Лечение) (+Атака)
 */
public class Mag extends MagicianGroup {
    int attack;

    public Mag(String name) {
        super(name, "Тёмные",  -6, -6);
        attack = 1;
        treatment = 2;
    }
}
