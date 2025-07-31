class Squad {
    String name;
    int numberOfSoldiers;
    String specialization;
    boolean isActive;

    Squad(String name, int numberOfSoldiers, String specialization, boolean isActive) {
        this.name = name;
        this.numberOfSoldiers = numberOfSoldiers;
        this.specialization = specialization;
        this.isActive = isActive;
    }

    public void getSquadInfo() {
        System.out.println("Squad Name: " + name);
        System.out.println("Number of Soldiers: " + numberOfSoldiers);
        System.out.println("Specialization: " + specialization);
        System.out.println("Active Status: " + isActive);
    }
}
