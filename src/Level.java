public enum Level {
    LOW(0),
    MEDIUM(1),
    WELLDONE(2);

    private int number;

    Level(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

