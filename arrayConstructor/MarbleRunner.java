class MarbleRunner {
    public static void main(String[] args) {

        Marble m1 = new Marble("Red","Glass");
 
		System.out.println("color: " + m1.color);
		 System.out.println("material: " +m1. material);
		 
		Marble m2 = new Marble(2.0,4.2);
		  System.out.println("diameterInCm: " + m2.diameterInCm);
		  System.out.println("weightInGrams: " +m2.weightInGrams);
		  
			   
		Marble m3 = new Marble(true);
		System.out.println("isTransparent: " + m3.isTransparent);
		
		Marble m4 = new Marble("Dots");  
		   System.out.println("pattern: " + m4.pattern);
	}
}