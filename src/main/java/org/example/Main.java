package org.example;
import org.example.units.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Archer("Фёдор"));
        heroes.add(new Crossbowman("Степан"));
        heroes.add(new Orc("Харитон"));
        heroes.add(new Spearman("Дмитрий"));
        heroes.add(new Monk("Феофан"));
        heroes.add(new Mag("Яков"));
        heroes.add(new Peasant("Джед"));
        heroes.add(new Servant("Павел"));

        for (BaseHero n : heroes) {
            System.out.println(n);
        }
    }
}