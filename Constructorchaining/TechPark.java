class TechPark {
    String name;
    String location;
    int totalBlocks;
    Block block;

    TechPark(String name, String location, int totalBlocks, Block block) {
        this.name = name;
        this.location = location;
        this.totalBlocks = totalBlocks;
        this.block = block;
    }

    public void getTechParkInfo() {
        System.out.println("TechPark Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Blocks: " + totalBlocks);
        block.getBlockInfo();
    }

}