class RailwayStation {
    String stationName;
    int platforms;
    boolean isJunction;
    Train train;

    RailwayStation(String stationName, int platforms, boolean isJunction, Train train) {
        this.stationName = stationName;
        this.platforms = platforms;
        this.isJunction = isJunction;
        this.train = train;
    }

    void getRailwayStationInfo() {
        System.out.println("Railway Station Name: " + stationName);
        System.out.println("Number of Platforms: " + platforms);
        System.out.println("Is Junction: " + isJunction);
        train.getTrainInfo();
    }
}
