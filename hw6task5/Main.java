package hw6task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> listOfWorkers = new ArrayList<>();
        int counter = 5;

        for (int i = 0; i < counter; i++) {
            System.out.println("Enter person info: ");
            String name = scanner.nextLine();
            System.out.println("Enter job: ");
            String job = scanner.nextLine();
            try {
                System.out.println("Enter age: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                listOfWorkers.add(new Worker(name, job, year));
                System.out.println();
            } catch (Exception e) {
                System.out.println("Enter correct integer value of age!");
                return;
            }
        }
        WorkerComparator comparator = new WorkerComparator();
        listOfWorkers.sort(comparator);
        System.out.println(listOfWorkers);

        System.out.println("Enter some age: ");
        int higherBorderOfAge = scanner.nextInt();
        System.out.println("Workers, whose stage higher then entered number:");
        for (Worker worker: listOfWorkers) {
            if (2023 - worker.getYear() > higherBorderOfAge)
                System.out.println(worker);
        }
        scanner.close();
    }
}

class WorkerComparator implements Comparator<Worker> {
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getPIB().compareTo(worker2.getPIB());
    }
}
