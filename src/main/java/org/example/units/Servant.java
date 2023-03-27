package org.example.units;
import org.example.groups.SquireGroup;

// Слуга наследуется от SquireGroup (+Поднос стрел)  (Атаковать не может)
public class Servant extends SquireGroup {
    public Servant(String name) {
        super(name, "Тёмные", -6, -6);
    }
}
