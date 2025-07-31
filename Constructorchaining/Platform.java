class Platform {
    int number;
    boolean isCovered;
    String type; // AC/Non-AC
    int capacity;

    Platform(int number, boolean isCovered, String type, int capacity) {
        this.number = number;
        this.isCovered = isCovered;
        this.type = type;
        this.capacity = capacity;
    }

    void getPlatformInfo() {
        System.out.println("Platform Number: " + number);
        System.out.println("Is Covered: " + isCovered);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
    }
}
