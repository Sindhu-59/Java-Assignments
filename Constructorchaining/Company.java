class Company {
    String name;
    String domain;
    int employeeCount;
    boolean isHiring;

    Company(String name, String domain, int employeeCount, boolean isHiring) {
        this.name = name;
        this.domain = domain;
        this.employeeCount = employeeCount;
        this.isHiring = isHiring;
    }

    public void getCompanyInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Domain: " + domain);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println("Is Hiring: " + isHiring);
    }
}
