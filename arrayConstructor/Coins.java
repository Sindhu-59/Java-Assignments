class Coins {
    String name;
    String country;
    String material;
	int year;
    double weight;
    double value;
	
	
	Coins(){
			
			System.out.println("The constructor is invoked");
			
		}
		Coins(String name,String country,String material){
			this.name=name;
			this.country=country;
			this.material=material;
		}
		Coins(int year){
			this.year=year;
		}
		Coins(double weight,double value){
			this.weight=weight;
			this.value=value;
			
		}
}