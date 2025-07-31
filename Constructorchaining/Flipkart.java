class Flipkart {
    String websiteName;
    String founder;
    int establishedYear;
    Category category;

    Flipkart(String websiteName, String founder, int establishedYear, Category category) {
        this.websiteName = websiteName;
        this.founder = founder;
        this.establishedYear = establishedYear;
        this.category = category;
    }

    public void getFlipkartInfo() {
        System.out.println("Website: " + websiteName);
        System.out.println("Founder: " + founder);
        System.out.println("Established: " + establishedYear);
        category.getCategoryInfo();
    }
}
