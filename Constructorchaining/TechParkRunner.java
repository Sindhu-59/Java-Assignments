class TechParkRunner {
    public static void main(String[] args) {
        Company company = new Company("Infosys", "IT Services", 25000, true);
        Block block = new Block("Block A", 10, true, company);
        TechPark techPark = new TechPark("Electronic City", "Bengaluru", 5, block);

        techPark.getTechParkInfo();
    }
}
