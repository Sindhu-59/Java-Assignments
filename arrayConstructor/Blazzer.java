class Blazzer {
    String brand;
    String size;
    String color;
    double price;
    boolean isFormal;
	
	Blazzer(){
			
			System.out.println("The constructor is invoked");
			
		}
		Blazzer(String brand,String size,String color){
			this.brand=brand;
			this.size=size;
			this.color=color;
		}
		Blazzer(double price){
			this.price=price;
		}
		Blazzer(boolean isFormal){
			this.isFormal=isFormal;	
		}

}
