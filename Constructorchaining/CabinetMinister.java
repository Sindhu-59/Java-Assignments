class CabinetMinister {
    String name;
    String portfolio;
    int experience;
    boolean isSenior;

    CabinetMinister(String name, String portfolio, int experience, boolean isSenior) {
        this.name = name;
        this.portfolio = portfolio;
        this.experience = experience;
        this.isSenior = isSenior;
    }

    void getCabinetMinisterInfo() {
        System.out.println("Cabinet Minister Name: " + name);
        System.out.println("Portfolio: " + portfolio);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Is Senior: " + isSenior);
    }
}
