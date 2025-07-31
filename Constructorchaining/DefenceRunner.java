class DefenceRunner {
    public static void main(String[] args) {
        Squad squad = new Squad("Special Ops", 100, "Mountain Warfare", true);
        Army army = new Army("Northern Command", 50000, "Udhampur", squad);
        Defence defence = new Defence("India", "General Manoj Pande", 525000, army);

        defence.getDefenceInfo();
    }
}

