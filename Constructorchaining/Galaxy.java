class Galaxy {
    String name;
    String type;
    long ageInMillionYears;
    int numberOfStars;
    SolarSystem solarSystem;

    public void getGalaxyInfo() {
        System.out.println("Galaxy Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age (million years): " + ageInMillionYears);
        System.out.println("Number of Stars: " + numberOfStars);
        solarSystem.getSolarSystemInfo();
    }
}
