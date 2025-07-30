class HatRunner {
    public static void main(String[] args) {

        Hat h1 = new Hat("Nike","black","Baseball Cap","M");
       
        System.out.println("Brand: " +h1.brand);
        System.out.println("Color: " + h1.color);
        System.out.println("Type: " + h1.type);
        System.out.println("Size: " + h1.size);
		
		Hat h2 = new Hat(1099.0);
        System.out.println("Price: " + h2.price);
		
		Hat h3 = new Hat(false);
        System.out.println("Adjustable: " + h3.isAdjustable);

    }
}
