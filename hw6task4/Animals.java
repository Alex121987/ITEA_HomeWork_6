package hw6task4;

public enum Animals {
    COW(6),
    HORSE(10),
    CAT(2),
    DOG(4),
    PIGG(3),
    SHIP(4),
    RABBIT(1);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal - " + name() + "\n" +
                "age - " + age + "\n";
    }
}
