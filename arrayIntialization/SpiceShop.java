class SpiceShop{
	
	static String spices[]={"cumin","coriander","turmeric","ginger","garlic","blackPepper","Sunscreen","cloves","ChilliPowder"};

	
	public static void main(String [] args){
		System.out.println("The number of spices are " +spices.length);
		//System.out.println(spices[0]+ "" +spices[1]+ "" +spices[2]+ "" +spices[3]+ "" +spices[4]+ "" +spices[5]+ "" +spices[6]+ "" +spices[7]+ "" +spices[8]+ "" +spices[9]+ "" +spices[10] );
		for(String spice:spices){
			System.out.println(spice);
		}
	}
}
	