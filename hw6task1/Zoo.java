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

        animalsInZoo.add(0, elephant);
        animalsInZoo.add(1, tiger);
        animalsInZoo.add(2, lion);
        animalsInZoo.add(3, giraffe);
        animalsInZoo.add(4, hipo);
        animalsInZoo.add(5, deer);
        animalsInZoo.add(6, capybara);
        animalsInZoo.add(7, moose);

        System.out.println(animalsInZoo);
    }
}
