package hw6task2;

import java.util.ArrayList;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет.
 * Використовуючи клас Zoo із Завдання 1, видалити 3, 5, 7 тварин,
 * дізнатися розмір списку і вивести в консоль.
 */

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animalsInZoo = new ArrayList<>();

        String elephant = "Elephant";
        String tiger = "Tiger";
        String lion = "Lion";
        String giraffe = "Giraffe";
        String hipo = "Hipo";
        String deer = "Deer";
        String capybara = "Capybara";
        String moose = "Moose";

        animalsInZoo.add(elephant);
        animalsInZoo.add(tiger);
        animalsInZoo.add(lion);
        animalsInZoo.add(giraffe);
        animalsInZoo.add(hipo);
        animalsInZoo.add(deer);
        animalsInZoo.add(capybara);
        animalsInZoo.add(moose);

        System.out.println(animalsInZoo);

        System.out.println("Current size - " + animalsInZoo.size());

        animalsInZoo.remove("Lion");
        animalsInZoo.remove("Hipo");
        animalsInZoo.remove("Capybara");

        System.out.println("Size after removing - " + animalsInZoo.size());

    }
}
