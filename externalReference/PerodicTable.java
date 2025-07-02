class PerodicTable{
	
	
	public static void main(String [] args){
		String hydrogen="Hydrogen";
		String oxygen="Oxygen";
		String nitrogen="Nitrogen";
		String zinc="Zinc";
		String mg="Mg";
		String copper="Copper";
		String Sodium="sodium";
		String neon="Neon";
		String nickel="Nickel";
		String iron="Iron";
		String boron="Boron";
		String helium="Helium";
		String PerodicTable[]={hydrogen,oxygen,nitrogen,zinc,mg,copper,Sodium,neon,nickel,iron,boron,helium};
		System.out.println("The number of PerodicTable are " +PerodicTable.length);
		System.out.println(PerodicTable[0]+ "" +PerodicTable[1]+ "" +PerodicTable[2]+ "" +PerodicTable[3]+ "" +PerodicTable[4]+ "" +PerodicTable[5]+ "" +PerodicTable[6]+ "" +PerodicTable[7]+ "" +PerodicTable[8]+ "" +PerodicTable[9]+ "" +PerodicTable[10]+ "" +PerodicTable[11] );
		for(String perodicTable:PerodicTable){
			System.out.println(perodicTable);
		}
	}
}
	