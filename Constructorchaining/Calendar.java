class Calendar {
    String calendarName;
    String owner;
    int year;
    Meeting meeting;

    Calendar(String calendarName, String owner, int year, Meeting meeting) {
        this.calendarName = calendarName;
        this.owner = owner;
        this.year = year;
        this.meeting = meeting;
    }

    public void getCalendarInfo() {
        System.out.println("Calendar Name: " + calendarName);
        System.out.println("Owner: " + owner);
        System.out.println("Year: " + year);
        meeting.getMeetingInfo();
    }
}
