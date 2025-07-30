class CoinsRunner {
    public static void main(String[] args) {

        Coins c1 = new Coins("Liberty Head Nickel","USA","Nickel");
			System.out.println("The Name of the coin is"+c1.name);
			System.out.println("The country of the coin is"+c1.country);
			System.out.println("The material of the coin is"+c1.material);

        Coins c2 = new Coins(1900);
			System.out.println("The year of the coin is"+c2.year);
		
        Coins c3 = new Coins(9.45,150.0);
			System.out.println("The weight of the coin is"+c3.weight);
			System.out.println("The value of the coin is"+c3.value);


    }
}
