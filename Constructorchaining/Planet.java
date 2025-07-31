class Planet {
    String name;
    double massInKg;
    int numberOfMoons;
    boolean supportsLife;

    public Planet(String name, double massInKg, int numberOfMoons, boolean supportsLife) {
        this.name = name;
        this.massInKg = massInKg;
        this.numberOfMoons = numberOfMoons;
        this.supportsLife = supportsLife;
    }

    public void getPlanetInfo() {
        System.out.println("Planet Name: " + name);
        System.out.println("Mass (kg): " + massInKg);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Supports Life: " + supportsLife);
    }
}
