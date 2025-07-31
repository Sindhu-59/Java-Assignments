class Page {
    int pageNumber;
    boolean isColored;
    String contentType;
    Article article; 

    public void getPageInfo() {
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Is Colored: " + isColored);
        System.out.println("Content Type: " + contentType);
        article.getArticleInfo();
        
    }
}
