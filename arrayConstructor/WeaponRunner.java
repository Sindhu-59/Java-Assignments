class WeaponRunner {
    public static void main(String[] args) {

        Weapon w1 = new Weapon("Katana","Sword","Steel");
        System.out.println("name: " +w1.name);
		 System.out.println("type: " +w1. type);
		  System.out.println("material: " + w1.material);
		  
		Weapon w2 = new Weapon(4.2);  
		   System.out.println("weight: " +w2.weight);
		   
		Weapon w3 = new Weapon(90);
		    System.out.println("damage: " +w3.damage);
			
		Weapon w4 = new Weapon(true);
			 System.out.println("isRanged: " +w4.isRanged);
}
}
