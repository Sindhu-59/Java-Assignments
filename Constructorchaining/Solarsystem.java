class SolarSystem {
    String name;
    int numberOfPlanets;
    boolean hasAsteroidBelt;
    String dominantStar;
    Planet planet;

    public void getSolarSystemInfo() {
        System.out.println("Solar System Name: " + name);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Dominant Star: " + dominantStar);
        planet.getPlanetInfo();
    }
}
