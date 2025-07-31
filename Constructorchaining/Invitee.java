class Invitee {
    String name;
    String email;
    String status;
    int age;

    Invitee(String name, String email, String status, int age) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.age = age;
    }

    public void getInviteeInfo() {
        System.out.println("Invitee Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Status: " + status);
        System.out.println("Age: " + age);
    }
}
