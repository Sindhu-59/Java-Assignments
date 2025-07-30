class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Flower Data");

        Flower flower1 = new Flower("Lily","White","Lilium candidum","Medium");
        System.out.println("Name: " + flower1.name);
        System.out.println("Color: " + flower1.color);
        System.out.println("Species: " + flower1.species);
        System.out.println("Fragrance: " + flower1.fragrance);
		
		
		Flower flower2 = new Flower(10);
        System.out.println("Lifespan: " + flower2.lifespanDays + " days");
		
		Flower flower3 = new Flower(80.00);
        System.out.println("Price/Stem: Rs." +flower3. pricePerStem);
		
		Flower flower4 = new Flower(false);
        System.out.println("Seasonal: " + flower4.isSeasonal);
		
		Flower flower5 = new Flower("Europe");
        System.out.println("Native Region: " + flower5.nativeRegion);
  }
}
