class LokSabha {
    String country;
    int totalSeats;
    String speaker;
    Seat seat;

    LokSabha(String country, int totalSeats, String speaker, Seat seat) {
        this.country = country;
        this.totalSeats = totalSeats;
        this.speaker = speaker;
        this.seat = seat;
    }

    public void getLokSabhaInfo() {
        System.out.println("Country: " + country);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Speaker: " + speaker);
        seat.getSeatInfo();
    }
}
