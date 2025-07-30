class BladeRunner {
    public static void main(String args[]) {
        Blade b1 = new Blade("Gillette","Razor","M");
			System.out.println("The Name of the brand "+b1.brand);
			System.out.println("The type of Blade "+b1.type);
			System.out.println("The usage "+b1.usage);
	
        Blade b2 = new Blade("L"); 
			System.out.println("The size of blade "+b2.size);
			
		Blade b3 = new Blade(59.0);
			System.out.println("The Price of the blade is "+b3.price);
			
        Blade b4 = new Blade(true);
			System.out.println("The blade is StainlessSteel "+b4.isStainlessSteel);
	}
}