class IPL{
	 
	public static void main(String args[]){
		String RCB="rCB";
		String puneWarriors="Pune Warriors";
		String CSK="cSK";
		String MI="mI";
		String RR="rR";
		String DC="dC";
		String GT="gT";
		String LSG="lSG";
		String PK="pK";
		String SRH="sRH";
		String teams[]={RCB,puneWarriors,CSK,MI,RR,DC,GT,LSG,PK,SRH};
		System.out.println("The number of teams in the IPL"+teams.length);
		//System.out.println(teams[0]+" "+teams[1]+" "+teams[3]+" "+teams[4]+" "+teams[5]+" "+teams[6]+" "+teams[7]+" "+teams[8]+" "+teams[9]);
		for(String IPLName:teams){
			System.out.println(IPLName);
		}
	}
}