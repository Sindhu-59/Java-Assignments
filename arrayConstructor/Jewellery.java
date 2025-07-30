class Jewellery {
    String type;
    String material;
	String design;
    double weight;
    double price;
    String occasion;
	
	Jewellery(){
			
			System.out.println("The constructor is invoked");
			
		}
		Jewellery(String type,String material,String design){
			this.type=type;
			this.material=material;
			this.design=design;
		}
		Jewellery(double weight,double price){
			
			this.weight=weight;
			this.price=price;
		}
		Jewellery(String occasion){
			this.occasion=occasion;
		}
		
	
}
