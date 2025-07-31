class Country {
    String name;
    String president;
    int noOfStates;
    State state;

    Country(String name, String president, int noOfStates, State state) {
        this.name = name;
        this.president = president;
        this.noOfStates = noOfStates;
        this.state = state;
    }

    public void getCountryInfo() {
        System.out.println("Country Name: " + name);
        System.out.println("President: " + president);
        System.out.println("Number of States: " + noOfStates);
        state.getStateInfo();
    }
}
