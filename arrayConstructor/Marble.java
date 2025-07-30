class Marble {
    String color;
    String material;
    double diameterInCm;
	double weightInGrams;
    boolean isTransparent;
	String pattern;
	
	Marble(){
			
			System.out.println("The constructor is invoked");
			
		}
		Marble(String color,String material){
			
			this.color=color;
			this.material=material;
		}
		Marble(double diameterInCm,double weightInGrams){
			
			this.diameterInCm=diameterInCm;
			this.weightInGrams=weightInGrams;
		}
		Marble(boolean isTransparent){
			this.isTransparent=isTransparent;
		}
		Marble(String pattern){
			this.pattern=pattern;
		
		}
	
	
}
