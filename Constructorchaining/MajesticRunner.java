class MajesticRunner {
    public static void main(String[] args) {
        Platform platform = new Platform(12, true, "AC", 150);
        BusStand busStand = new BusStand("Kempegowda Bus Stand", 20, true, platform);
        Majestic majestic = new Majestic("Majestic Circle", "Bengaluru", busStand);

        majestic.getMajesticInfo();
    }
}
