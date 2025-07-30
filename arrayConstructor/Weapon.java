class Weapon {
    String name;
    String type;
    String material;
    double weight;
    int damage;
    boolean isRanged;
	
	Weapon(){
			
			System.out.println("The constructor is invoked");
			
		}
		Weapon(String name,String type,String material){
			this.name=name;
			this.type=type;
			this.material=material;
			
		}
		Weapon(double weight){
			
		}
		Weapon(int damage){
			
			this.weight=weight;
		}
		Weapon(boolean isRanged){
			
			this.damage=damage;
			this.isRanged=isRanged;
			
		}
	
}
