class CountryRunner {
    public static void main(String[] args) {

        City city = new City("Bengaluru", 12000000, "IT Hub", true);

        State state = new State("Karnataka", "Kannada", "Siddaramaiah", city);

        Country country = new Country("India", "Droupadi Murmu", 28, state);

        country.getCountryInfo();
    }
}
