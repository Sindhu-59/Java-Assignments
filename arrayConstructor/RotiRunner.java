class RotiRunner {
    public static void main(String[] args) {

        Roti r1 = new Roti("Plain Roti","Wheat");
		
		System.out.println("The type is "+r1.type);
		System.out.println("The flourUsed is "+r1.flourUsed);
		
		Roti r2 = new Roti(7.5);
		System.out.println("The diameterInInches is "+r2.diameterInInches);
		
		Roti r3 = new Roti(false,true);
		System.out.println("The isStuffed is "+r3.isStuffed);
		System.out.println("The region is "+r3.region);
		
		Roti r4 = new Roti("punjab");
		System.out.println("The hot is "+r4.isHot);
 
    }
}
