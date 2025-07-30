class Chocolate{

	int chocolateId;
	String chocolateName;
	String ingredients[];
	String brand;
	double price;
	
	Chocolate(){
	}
	Chocolate(int chocolateId){
		this.chocolateId=chocolateId;
	}
	/*Chocolate(String chocolateName,String ingredients){
		this.chocolateName=chocolateName;
	}*/
	Chocolate(String brand,double price){
		this.brand=brand;
		this.price=price;
		
		public void getChocolateDetails(){
			System.out.println("The chocolateName is "+chocolateName);
			for(String ingredient:ingredients)
				System.out.println(ingredient);
	}
}