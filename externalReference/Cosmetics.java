class Cosmetics{
	

	public static void main(String [] args){
		String Powder = "powder";
		String Lipstick ="lipstick";
		String EyeLiner ="eyeliner";
		String Kajol ="kajol";
		String Bindi="bindi";
		String HairSpray="hairspray";
		String Sunscreen="sunscreen";
		String Moisturiserr="moisturiser";
		String Toner="toner";
		String LipLiner="lipLiner";
		String EyebrowPencil="eyebrowPencil";
		String Cosmetics[]={Powder,Lipstick,EyeLiner,Kajol,Bindi,HairSpray,Sunscreen,Moisturiser,Toner,LipLiner,EyebrowPencil};
		System.out.println("The number of Cosmetics are " +Cosmetics.length);
		//System.out.println(Cosmetics[0]+ "" +Cosmetics[1]+ "" +Cosmetics[2]+ "" +Cosmetics[3]+ "" +Cosmetics[4]+ "" +Cosmetics[5]+ "" +Cosmetics[6]+ "" +Cosmetics[7]+ "" +Cosmetics[8]+ "" +Cosmetics[9]+ "" +Cosmetics[10] );
		for(String Cosmetic:Cosmetics){
			System.out.println(Cosmetic);
		}
			
	}
}
	