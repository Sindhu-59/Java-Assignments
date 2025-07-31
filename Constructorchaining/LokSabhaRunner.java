class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician = new Politician("Rahul Sharma", "Independent", 47, "Lucknow");
        Seat seat = new Seat(18, false, "Uttar Pradesh", politician);
        LokSabha lokSabha = new LokSabha("India", 543, "Om Birla", seat);

        lokSabha.getLokSabhaInfo();
    }
}
