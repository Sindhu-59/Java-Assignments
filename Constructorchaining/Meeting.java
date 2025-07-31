class Meeting {
    String topic;
    String date;
    String time;
    boolean isOnline;
    Invitee invitee;

    Meeting(String topic, String date, String time, boolean isOnline, Invitee invitee) {
        this.topic = topic;
        this.date = date;
        this.time = time;
        this.isOnline = isOnline;
        this.invitee = invitee;
    }

    public void getMeetingInfo() {
        System.out.println("Meeting Topic: " + topic);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Is Online: " + isOnline);
        invitee.getInviteeInfo();
    }
}
