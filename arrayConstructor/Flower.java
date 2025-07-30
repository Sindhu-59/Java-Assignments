class Flower {
    String name;
    String color;
    String species;
    String fragrance;
    int lifespanDays;
    double pricePerStem;
    boolean isSeasonal;
    String nativeRegion;

   
    Flower(String name, String color, String species, String fragrance){
		this.name = name;
        this.color = color;
        this.species = species;
        this.fragrance = fragrance;
		
	}
    Flower(int lifespanDays){
		
		this.lifespanDays = lifespanDays;
		
	}
	Flower(double pricePerStem){
		
		this.pricePerStem = pricePerStem;
	}
	Flower(boolean isSeasonal){
		
		 this.isSeasonal = isSeasonal;
	}
	Flower(String nativeRegion) {
    
        this.nativeRegion = nativeRegion;
    }

}
