class PerodicTable{
	
	static String PerodicTable[]={"hydrogen","oxygen","nitrogen","zinc","mg","copper","Sodium","neon","nickel","iron","boron","helium"};

	
	public static void main(String [] args){
		System.out.println("The number of PerodicTable are " +PerodicTable.length);
		System.out.println(PerodicTable[0]+ "" +PerodicTable[1]+ "" +PerodicTable[2]+ "" +PerodicTable[3]+ "" +PerodicTable[4]+ "" +PerodicTable[5]+ "" +PerodicTable[6]+ "" +PerodicTable[7]+ "" +PerodicTable[8]+ "" +PerodicTable[9]+ "" +PerodicTable[10]+ "" +PerodicTable[11] );
		for(String perodicTable:PerodicTable){
			System.out.println(perodicTable);
		}
	}
}
	