class GalaxyRunner {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.972e24, 1, true);

        SolarSystem solarSystem = new SolarSystem("Solar", 8, true, "Sun", earth);

        Galaxy galaxy = new Galaxy("Milky Way", "Spiral", 13600, 100_000_000_000l, solarSystem);

        galaxy.getGalaxyInfo();
    }
}
