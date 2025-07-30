class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Amusement Park Data");
		

        AmusementPark park1 = new AmusementPark("Wonderla Bengaluru","Bengaluru");
			System.out.println("The name of the park "+park1.name);
			System.out.println("The Location of the park "+park1.locationCity);
			
		AmusementPark park2 = new AmusementPark(130.0,25.0);	
			
			System.out.println("The acre of the area "+park2.areaAcres);
			System.out.println("The ticket price for adults "+park2.ticketPriceAdult);
			
		AmusementPark park3 = new AmusementPark(100);
			System.out.println("The number of rides "+park3.numberOfRides);


		AmusementPark park4 = new AmusementPark(true);
			System.out.println("The park has WaterPark Section "+park4.hasWaterParkSection);
	}
}
        