class Cracker {
    String name;
    String type;
    String brand;
    double price;
    int quantityPerPack;
    String safetyStandard;
    String manufacturingLocation;
	boolean isSoundCracker;

    Cracker(String name, String type, String brand){
		this.name = name;
        this.type = type;
        this.brand = brand;
	}
	Cracker(double price){
		this.price = price;
	}
	Cracker(int quantityPerPack){
		this.quantityPerPack = quantityPerPack;

	}
	Cracker(String safetyStandard,String manufacturingLocation) {
		this.safetyStandard = safetyStandard;
        this.isSoundCracker = isSoundCracker;
	}
	Cracker( boolean isSoundCracker){
		this.manufacturingLocation = manufacturingLocation;
	}
    
}
