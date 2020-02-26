package com.kodilla.abstracts;

public class AnimalProcessor {

    public void process(Animal animal) { // metoda przyjmuje ogólny typ, każdy obiekt który dziedziczy po Animal
        System.out.println("Animal has " + animal.getNumberOfLegs() + " legs");  // tu nie wywołujemy metody z klasy abstrakcyjnej tylko z każdego obiektu który jest podtypem Animal
        animal.giveVoice();
    }

}
