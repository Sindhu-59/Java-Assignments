class PlayStation {
    public static void main(String args[]) {
		 String KhoKho="KhoKho";
		String Kabaddi="Kabaddi";
		String GilliDanda="GilliDanda";
		String Kancha="Kancha";
		String Lagori="Lagori";
		String KithKith="KithKith";
		String Pittu="Pittu"; 
		String VishAmrit="VishAmrit";
		String ChorPolice="ChorPolice";
		String Antakshari="Antakshari";
         String games[] = {KhoKho, Kabaddi,GilliDanda, Kancha, Lagori, KithKith, Pittu, VishAmrit, ChorPolice, Antakshari};
		 
        System.out.println("The number of games" + games.length);
       // System.out.println(games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]);
	   for(String game:games){
			System.out.println(game);
		}
    }
}
