class FlipkartRunner {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", "Samsung", 29999.99, true);
        Category category = new Category("Electronics", 5000, true, product);
        Flipkart flipkart = new Flipkart("Flipkart", "Binny Bansal", 2007, category);

        flipkart.getFlipkartInfo();
    }
}
