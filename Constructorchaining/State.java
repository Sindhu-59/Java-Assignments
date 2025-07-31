class State {
    String name;
    String language;
    String chiefMinister;
    City city;

    State(String name, String language, String chiefMinister, City city) {
        this.name = name;
        this.language = language;
        this.chiefMinister = chiefMinister;
        this.city = city;
    }

    public void getStateInfo() {
        System.out.println("State Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Chief Minister: " + chiefMinister);
        city.getCityInfo();
    }
}
