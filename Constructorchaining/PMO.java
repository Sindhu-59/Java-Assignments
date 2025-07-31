class PMO {
    String officeLocation;
    int establishedYear;
    PrimeMinister pm;

    PMO(String officeLocation, int establishedYear, PrimeMinister pm) {
        this.officeLocation = officeLocation;
        this.establishedYear = establishedYear;
        this.pm = pm;
    }

    void getPMOInfo() {
        System.out.println("PMO Location: " + officeLocation);
        System.out.println("Established Year: " + establishedYear);
        pm.getPrimeMinisterInfo();
    }
}
