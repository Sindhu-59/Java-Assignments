class Seat {
    int seatNumber;
    boolean isReserved;
    String state;
    Politician politician;

    Seat(int seatNumber, boolean isReserved, String state, Politician politician) {
        this.seatNumber = seatNumber;
        this.isReserved = isReserved;
        this.state = state;
        this.politician = politician;
    }

    public void getSeatInfo() {
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Reserved: " + isReserved);
        System.out.println("State: " + state);
        politician.getPoliticianInfo();
    }
}
