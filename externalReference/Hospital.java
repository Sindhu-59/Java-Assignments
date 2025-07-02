class Hospital {
    public static void main(String args[]) {
		String Dr.Sathya="dr.Sathya";
		String Dr.Manjunath="dr.Manjunath";
		String Dr.Yuvaraj="dr.Yuvaraj";
		String Dr.PriyaMehta="dr.PriyaMehta";
		String Dr.AmitSingh="dr.AmitSingh";
		String Dr.SwatiSharma="dr.SwatiSharma";
		String Dr.SureshReddy="dr.SureshReddy";
		String Dr.AnitaDesai="dr.AnitaDesai";
		String Dr.VikramRao="dr.VikramRao";
		String Dr.RekhaJoshi="dr.RekhaJoshi";
		
        String doctorNames[]={Dr.Sathya,Dr.Manjunath,Dr.Yuvaraj,Dr.PriyaMehta,Dr.AmitSingh,Dr.SwatiSharma,Dr.SureshReddy,Dr.AnitaDesai,Dr.VikramRao,Dr.RekhaJoshi};
        System.out.println("The number of doctors: " + doctorNames.length);
        //System.out.println(doctorNames[0]+" "+doctorNames[1]+" "+doctorNames[2] +" "+doctorNames[3]+" "+doctorNames[4] + " " +doctorNames[5] + " " +doctorNames[6] +" "+doctorNames[7] + " " + doctorNames[8] + " " + doctorNames[9]);
		for(String hospital:doctorNames){
			System.out.println(hospital);
		}
    }
}
