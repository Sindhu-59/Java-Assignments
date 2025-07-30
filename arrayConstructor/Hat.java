class Hat {
    String brand;
    String color;
    String type;
    String size;
    double price;
    boolean isAdjustable;

    
    public Hat(String brand, String color, String type, String size){

		this.brand = brand;
        this.color = color;
        this.type = type;
        this.size = size;

	}
	Hat(double price){
		this.price = price;
	}
	Hat(boolean isAdjustable) {
       
        this.isAdjustable = isAdjustable;
    }

}
