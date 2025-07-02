class Cosmetics{
	
	static String Cosmetics[]={"Powder","Lipstick","EyeLiner","Kajol","Bindi","HairSpray","Sunscreen","Moisturiser","Toner","LipLiner","EyebrowPencil"`};

	
	public static void main(String [] args){
		System.out.println("The number of Cosmetics are " +Cosmetics.length);
		//System.out.println(Cosmetics[0]+ "" +Cosmetics[1]+ "" +Cosmetics[2]+ "" +Cosmetics[3]+ "" +Cosmetics[4]+ "" +Cosmetics[5]+ "" +Cosmetics[6]+ "" +Cosmetics[7]+ "" +Cosmetics[8]+ "" +Cosmetics[9]+ "" +Cosmetics[10] );
		for(String Cosmetic:Cosmetics){
			System.out.println(Cosmetic);
		}
			
	}
}
	