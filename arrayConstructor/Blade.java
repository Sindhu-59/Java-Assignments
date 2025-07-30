class Blade {
    String brand;
    String type;
    String size;
	String usage;
    double price;
    boolean isStainlessSteel;

	Blade(){
			
			System.out.println("The constructor is invoked");
			
		}
		Blade(String brand,String type,String usage){
			this.brand=brand;
			this.type=type;
			this.usage=usage;
				
		}
		
		Blade(String size){
			this.size=size;
		}
			
		Blade(double price){
			this.price=price;
			
		}
		Blade(boolean isStainlessSteel){
			
			this.isStainlessSteel=isStainlessSteel;
			
		}
	
	}
