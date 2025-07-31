class YeshvanthpurRunner {
    public static void main(String[] args) {
        Train train = new Train("KSR Bengaluru Express", 12627, "Superfast", 22);
        RailwayStation station = new RailwayStation("Bangalore City Junction", 10, true, train);
        Yeshvanthpur yeshvanthpur = new Yeshvanthpur("yeshvanthpur", "Bengaluru", station);

        yeshvanthpur.getYeshvanthpurInfo();
    }
}
