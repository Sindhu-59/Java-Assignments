class Rod {
	int id;
    String material;
	String color;
    double lengthCm;
    double diameterCm;
    double weightKg;
    double price;
	
	Rod(){
		System.out.println("The constructor is invoked");
	}
	Rod(int id){
		this.id=id;
	}
	Rod(String material,String color){
		this.material=material;
		this.color=color;
	}
	Rod(double lengthCm,double diameterCm,double weightKg,double price){
		this.lengthCm=lengthCm;
		this.diameterCm=diameterCm;
		this.weightKg=weightKg;
		this.price=price;
	}
    
	}