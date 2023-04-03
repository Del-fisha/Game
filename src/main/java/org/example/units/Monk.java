package org.example.units;

import org.example.groups.MagicianGroup;

/**Монах наследуется от MagicianGroup (+Лечение) (Атаковать не может)
 */
public class Monk extends MagicianGroup {
    public Monk() {
        super("Светлые", 6,6);
        treatment = 2;
    }
    @Override
    public String getInfo() {
        return "Монах";
    }
}
