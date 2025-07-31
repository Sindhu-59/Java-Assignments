class Magzine {
    String title;
    String publisher;
    int totalPages;
    double price;
    Page page;  

    public void getMagzineInfo() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Price: " + price);
        page.getPageInfo();
        
    }
}
