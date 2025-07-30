class ForestSafariRunner {
    public static void main(String[] args) {

        ForestSafari safari1 = new ForestSafari("Kaziranga", "Assam");
        System.out.println("Name: " +safari1.name); 
		System.out.println(" Location: " +safari1.location); 
		
		ForestSafari safari2 = new ForestSafari(true,false);
		
		System.out.println("Guided: " + safari2.isGuided );
		
		ForestSafari safari5 = new ForestSafari(1);
		System.out.println(" Night Safari: " +safari5.nightSafariAvailable);
		
		
        ForestSafari safari3 = new ForestSafari(1);
		System.out.println("Duration: " + safari2.durationDays );
		
		
        ForestSafari safari4 = new ForestSafari(200.0);
        System.out.println(" Entry Fee:" +safari4.entryFee);
				

      }
}
