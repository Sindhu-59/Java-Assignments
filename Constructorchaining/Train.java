class Train {
    String name;
    int number;
    String type;
    int coaches;

    Train(String name, int number, String type, int coaches) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.coaches = coaches;
    }

    void getTrainInfo() {
        System.out.println("Train Name: " + name);
        System.out.println("Train Number: " + number);
        System.out.println("Type: " + type);
        System.out.println("Number of Coaches: " + coaches);
    }
}
