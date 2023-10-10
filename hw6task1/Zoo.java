package hw6task1;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
 * У класі створити список, який записати 8 тварин через метод add(index, element).
 * Вивести список у консоль.
 */

import java.util.ArrayList;

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
    }
}
