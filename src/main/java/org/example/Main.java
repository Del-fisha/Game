package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(8)) {
                case 0 -> heroes.add(new Archer());
                case 1 -> heroes.add(new Crossbowman());
                case 2 -> heroes.add(new Orc());
                case 3 -> heroes.add(new Spearman());
                case 4 -> heroes.add(new Monk());
                case 5 -> heroes.add(new Mag());
                case 6 -> heroes.add(new Peasant());
                default -> heroes.add(new Servant());
            }
        }
        heroes.forEach(n -> System.out.println(n.getInfo() + " - " + n.name));
    }

}