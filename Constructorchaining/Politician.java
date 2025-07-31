class Politician {
    String name;
    String party;
    int age;
    String constituency;

    Politician(String name, String party, int age, String constituency) {
        this.name = name;
        this.party = party;
        this.age = age;
        this.constituency = constituency;
    }

    public void getPoliticianInfo() {
        System.out.println("Politician Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Age: " + age);
        System.out.println("Constituency: " + constituency);
    }
}
