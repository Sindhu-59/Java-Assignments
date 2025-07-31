class Yeshvanthpur {
    String location;
    String city;
    RailwayStation station;

    Yeshvanthpur(String location, String city, RailwayStation station) {
        this.location = location;
        this.city = city;
        this.station = station;
    }

    void getYeshvanthpurInfo() {
        System.out.println("Majestic Location: " + location);
        System.out.println("City: " + city);
        station.getRailwayStationInfo();
    }
}
