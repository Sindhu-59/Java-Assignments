class CalendarRunner {
    public static void main(String[] args) {

        Invitee invitee = new Invitee("Sushma", "sushma123@gmail.com", "Accepted", 30);

        Meeting meeting = new Meeting("Team Sync", "2025-08-01", "10:00 AM", true, invitee);

        Calendar calendar = new Calendar("Work Calendar", "John Doe", 2025, meeting);

        calendar.getCalendarInfo();
    }
}
