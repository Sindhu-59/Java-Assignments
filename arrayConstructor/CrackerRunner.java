class CrackerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Cracker Data");

        Cracker c1 =new Cracker("Gold Sparklers (10cm)", "Sparkler", "Standard Fireworks");
			System.out.println("Name: " + c1.name); 
			System.out.println("Type: " + c1.type);
			System.out.println("Brand: " +c1. brand);
	
        Cracker c2 =new Cracker(250.00);
			System.out.println("Price: ₹" + c2.price);
		
        Cracker c3 =new Cracker(5);
			System.out.println("Qty/Pack: " +c3.quantityPerPack);
			
        Cracker c4 =new Cracker("Green Cracker","Sivakasi");
		System.out.println("Safety: " + c4.safetyStandard); 
		System.out.println("Sound: " + c4.isSoundCracker);
		
        Cracker c5 =new Cracker(true);
		System.out.println("Location: " +c5. manufacturingLocation);
        
    }
}
