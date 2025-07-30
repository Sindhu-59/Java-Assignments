class KarateSuit {
    String brand;
    String size;
    String color;
    String material;
    boolean isProfessional;
    double price;
	
	KarateSuit(){
			
			System.out.println("The constructor is invoked");
			
		}
		KarateSuit(String brand,String size,String color,String material){
			this.brand=brand;
			this.size=size;
			this.color=color;
			this.material=material;
			
		}
		KarateSuit(boolean isProfessional){
			this.isProfessional=isProfessional;
			
		}
		KarateSuit(double price){
		
			this.price=price;
			
		}
	
	
}
