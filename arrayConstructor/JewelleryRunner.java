class JewelleryRunner {
    public static void main(String[] args) {

        Jewellery j1 = new Jewellery("Necklace","Gold","Floral");
        
		System.out.println("the type is "+j1.type);
		System.out.println("the material is "+j1.material);
		System.out.println("theweight is "+j1.weight);
		
		Jewellery j2 = new Jewellery(5.0,55000.0);
		System.out.println("the design is "+j2.design);
		System.out.println("the price is "+j2.price);
		
		Jewellery j3 = new Jewellery("engagement");
		System.out.println("the occasion is "+j3.occasion);

    }
}
