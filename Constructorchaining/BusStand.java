class BusStand {
    String name;
    int totalPlatforms;
    boolean hasWaitingRoom;
    Platform platform;

    BusStand(String name, int totalPlatforms, boolean hasWaitingRoom, Platform platform) {
        this.name = name;
        this.totalPlatforms = totalPlatforms;
        this.hasWaitingRoom = hasWaitingRoom;
        this.platform = platform;
    }

    void getBusStandInfo() {
        System.out.println("Bus Stand Name: " + name);
        System.out.println("Total Platforms: " + totalPlatforms);
        System.out.println("Has Waiting Room: " + hasWaitingRoom);
        platform.getPlatformInfo();
    }
}
