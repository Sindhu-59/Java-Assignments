class Jacket{

	String Color;
	String brand;
	String materialType;
	double price;
	char size;
	
	Jacket(String Color,String brand,String materialType,double price,char size){
		this.Color=Color;
		this.brand=brand;
		this.materialType=materialType;
		this.price=price;
		this.size=size;
		}
		
		public void readJacketInfo(){
		
		System.out.println("The jacket color is"+Color);
		System.out.println("The jacket brand is"+brand);
		System.out.println("The jacket materialType is"+materialType);
		System.out.println("The jacket price is"+price);
		System.out.println("The jacket size is"+size);
		
		}
		}