package hw6task6;

public enum Vehicle {
    BMW(20_000) {
        @Override
        public String getColor() {
            return "Red";
        }
    },
    MERCEDES(25_000) {
        @Override
        public String getColor() {
            return "White";
        }
    },
    VOLVO(17_000) {
        @Override
        public String getColor() {
            return "Silver";
        }
    },
    TOYOTA(15_000) {
        @Override
        public String getColor() {
            return "Black";
        }
    },
    KIA(12_000) {
        @Override
        public String getColor() {
            return "Yellow";
        }
    },
    VOLKSWAGEN(13_000) {
        @Override
        public String getColor() {
            return "Green";
        }
    },
    RENAULT(14_000) {
        @Override
        public String getColor() {
            return "Brown";
        }
    };

    private int price;
    Vehicle(int price) {
        this.price = price;
    }

    public abstract String getColor();

    @Override
    public String toString() {
        return "Vehicle - " + " " + this.name() + "\n" +
                "price - " + price + "\n" +
                "color - " + this.getColor() + "\n";
    }
}
