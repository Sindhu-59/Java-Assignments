class PrimeMinister {
    String name;
    String party;
    int term;
    CabinetMinister cabinetMinister;

    PrimeMinister(String name, String party, int term, CabinetMinister cabinetMinister) {
        this.name = name;
        this.party = party;
        this.term = term;
        this.cabinetMinister = cabinetMinister;
    }

    void getPrimeMinisterInfo() {
        System.out.println("Prime Minister Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Term: " + term + " years");
        cabinetMinister.getCabinetMinisterInfo();
    }
}
