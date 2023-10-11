package hw6task5;

import java.util.Comparator;

class WorkerComparator implements Comparator<Worker> {
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getPIB().compareTo(worker2.getPIB());
    }
}
