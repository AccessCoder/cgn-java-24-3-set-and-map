package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String berry1 = "Strawberry";
        String berry2 = "Raspberry";
        String berry3 = "Blueberry";
        String berry4 = "Blueberry";

        Set<String> berrys = new HashSet<>();
        berrys.add(berry1);
        berrys.add(berry2);
        berrys.add(berry3);
        berrys.add(berry4);

        for (String s:berrys) {
            System.out.println(s);
        }
        Animal animal1 = new Animal("Bello", 2);
        Animal animal2 = new Animal("Bella", 4);
        Animal animal3 = new Animal("Mr Kitten", 1);
        Animal animal4 = new Animal("Mr Kitten", 1);

        Set<Animal> pets = new HashSet<>();
        pets.add(animal1);
        pets.add(animal2);
        pets.add(animal3);
        pets.add(animal4);

        for (Animal s:pets) {
            System.out.println(s);
        }

        String word1 = "Hello";
        String word2 = "Morning";
        String word3 = "Evening";
        String word4 = "Day";

        Map<String, String> dictionary = new HashMap<>();
        //Einträge zur Map hinzufügen (Key, Value)
        dictionary.put("Hallo", word1);
        dictionary.put("Morgen", word2);
        dictionary.put("Abend", word3);
        dictionary.put("Tag", word4);

        //Eintrag aus Map lesen
        dictionary.get("Hallo");

        //Eintrag aus Map löschen
        dictionary.remove("Tag");

        //Eintrag austauschen
        dictionary.replace("Abend", "evening"); //Key muss bereits existieren
        dictionary.put("Abend", word3); //Egal, speichert immer!

        //Map auf Einträge Reduzieren, also ohne Keys
        dictionary.values();

        //Iterieren über Map Einträge
        for (String s:dictionary.values()) {
            System.out.println(s);
        }

        //Sammlung aller Keys der Map erzeugen
        dictionary.keySet();

    }
}