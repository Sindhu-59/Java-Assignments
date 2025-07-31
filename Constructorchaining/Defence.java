class Defence {
    String country;
    String chiefOfDefence;
    int budgetInCrores;
    Army army;

    Defence(String country, String chiefOfDefence, int budgetInCrores, Army army) {
        this.country = country;
        this.chiefOfDefence = chiefOfDefence;
        this.budgetInCrores = budgetInCrores;
        this.army = army;
    }

    public void getDefenceInfo() {
        System.out.println("Country: " + country);
        System.out.println("Chief of Defence: " + chiefOfDefence);
        System.out.println("Defence Budget (Cr): " + budgetInCrores);
        army.getArmyInfo();
    }
}
