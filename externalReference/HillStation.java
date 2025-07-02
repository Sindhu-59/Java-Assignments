class HillStation {
    public static void main(String args[]) {
		String ClubMahindraMadikeri = "clubMahindraMadikeri";
		String Atitya ="atitya";
		String satkaraChikmagalur ="SatkaraChikmagalur";
		String theTamaraCoorg ="TheTamaraCoorg";
		String ourNativeVillage="OurNativeVillage";
		String silverBrookEstate="SilverBrookEstate";
		String theSeraiChikmagalur="TheSeraiChikmagalur";
		
        String resorts[] = {ClubMahindraMadikeri,Atitya,satkaraChikmagalur,theTamaraCoorg,ourNativeVillage,silverBrookEstate,theSeraiChikmagalur};
        System.out.println("The number of resorts " + resorts.length);
        //System.out.println(resorts[0]+" "+ resorts[1]+" "+resorts[2]+" "+resorts[3]+" "+resorts[4]+" "+resorts[5]+" "+resorts[6]);
		for(String resort:resorts){
			System.out.println(resort);
		}
    }
}
