class City{
	
	static int pinCodes[]={577216,577213,577214,577217,577219,577299,577006,577456,577947,577343,577348,577299,577900,577089};

	
	public static void main(String [] args){
		System.out.println("The number of pinCodes are " +pinCodes.length);
		//System.out.println(pinCodes[0]+ "" +pinCodes[1]+ "" +pinCodes[2]+ "" +pinCodes[3]+ "" +pinCodes[4]+ "" +pinCodes[5]+ "" +pinCodes[6]+ "" +pinCodes[7]+ "" +pinCodes[8]+ "" +pinCodes[9]+ "" +pinCodes[10]+ "" +pinCodes[11]+ "" +pinCodes[12]+ "" +pinCodes[13]+ "" +pinCodes[14] );
		for(String pinCode:pinCodes){
			System.out.println(pinCode);
		}
	}
}
	