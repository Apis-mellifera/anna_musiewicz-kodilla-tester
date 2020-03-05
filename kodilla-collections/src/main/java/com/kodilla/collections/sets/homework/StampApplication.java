package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Airmail stamp", 0.55, 0.45, true ));
        stamps.add(new Stamp("Express stamp", 0.43, 0.31,true ));
        stamps.add(new Stamp("Commemorative stamp", 0.58, 0.49, false ));
        stamps.add(new Stamp("Express stamp", 0.43, 0.31,true ));
        stamps.add(new Stamp("Airmail stamp", 0.55, 0.45, true ));

        System.out.println(stamps.size());

        for ( Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
