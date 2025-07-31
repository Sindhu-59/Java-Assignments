class City {
    String name;
    int population;
    String famousFor;
    boolean isCapital;

    City(String name, int population, String famousFor, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.famousFor = famousFor;
        this.isCapital = isCapital;
    }

    public void getCityInfo() {
        System.out.println("City Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Famous For: " + famousFor);
        System.out.println("Is Capital: " + isCapital);
    }
}
