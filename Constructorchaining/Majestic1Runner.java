class Majestic1Runner {
    public static void main(String[] args) {
        Train train = new Train("KSR Bengaluru Express", 12627, "Superfast", 22);
        RailwayStation station = new RailwayStation("Bangalore City Junction", 10, true, train);
        Majestic1 majestic = new Majestic("Majestic Circle", "Bengaluru", station);

        majestic.getMajestic1Info();
    }
}
