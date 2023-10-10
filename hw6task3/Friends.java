package hw6task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Використовуючи Intelij IDEA, створити клас Friends.
 * За допомогою методів ArrayList додати масив імена друзів.
 * Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */
public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendsNames = new ArrayList<>();

        friendsNames.add("Artem");
        friendsNames.add("Sergiy");
        friendsNames.add("Iryna");
        friendsNames.add("Yaroslav");
        friendsNames.add("Yuliya");
        friendsNames.add("Olha");
        friendsNames.add("Nadiya");
        friendsNames.add("Timofiy");

        System.out.println(friendsNames);
        Collections.sort(friendsNames);
        System.out.println(friendsNames);

    }
}
