class Category {
    String type;
    int numberOfProducts;
    boolean isTopCategory;
    Product product;

    Category(String type, int numberOfProducts, boolean isTopCategory, Product product) {
        this.type = type;
        this.numberOfProducts = numberOfProducts;
        this.isTopCategory = isTopCategory;
        this.product = product;
    }

    public void getCategoryInfo() {
        System.out.println("Category: " + type);
        System.out.println("No. of Products: " + numberOfProducts);
        System.out.println("Top Category: " + isTopCategory);
        product.getProductInfo();
    }
}
