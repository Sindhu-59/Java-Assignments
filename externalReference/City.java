class City{
	public static void main(String pins[]){
	int kattehaklu=577201;
	int devangi=577301;
	int melige=577401;
	int heddur=577427;
	int shirur=577429;
	int kuppali=577418;
	int shedgar=577432;
	int kolgi=577211;
	int belur=577548;
	int udupi=577452;
	int yediyur=577126;
	int pincodes[]={kattehaklu,devangi,melige,heddur,shirur,kuppali,kolgi,belur,udupi,yediyur};
	System.out.println("The total number of pincodes"+pincodes.length);
	//System.out.println(pincodes[0]+" "+pincodes[1]+""+pincodes[3]+" "+pincodes[4]+" "+pincodes[5]+" "+pincodes[6]+" "+pincodes[7]+" "+pincodes[8]+" "+pincodes[9]+" "+pincodes[10]+" "+pincodes[11]+" "+pincodes[12]+" "+pincodes[13]);
	for(int pincode:pincodes){
		System.out.println(pincode);
	}
	}
}
	