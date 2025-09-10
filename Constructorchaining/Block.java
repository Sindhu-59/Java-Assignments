class Block {
    String blockName;
    int floorCount;
    boolean hasCafeteria;
    Company company;

    Block(String blockName, int floorCount, boolean hasCafeteria, Company company) {
        this.blockName = blockName;
        this.floorCount = floorCount;
        this.hasCafeteria = hasCafeteria;
        this.company = company;
    }

    public void getBlockInfo() {
        System.out.println("Block Name  " + blockName);
        System.out.println("Number of Floors: " + floorCount);
        System.out.println("Has Cafeteria: " + hasCafeteria);
        company.getCompanyInfo();

    }
}
