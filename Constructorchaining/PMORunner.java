class PMORunner {
    public static void main(String[] args) {
        CabinetMinister minister = new CabinetMinister("Rajnath Singh", "Defence", 30, true);
        PrimeMinister pm = new PrimeMinister("Narendra Modi", "BJP", 10, minister);
        PMO pmo = new PMO("New Delhi", 1947, pm);

        pmo.getPMOInfo();
    }
}
