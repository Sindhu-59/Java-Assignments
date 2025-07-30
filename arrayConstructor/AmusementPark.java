class AmusementPark {
    String name;
    String locationCity;
    double areaAcres;
	double ticketPriceAdult;
    int numberOfRides;
    boolean hasWaterParkSection;
	
	AmusementPark(){
			
			System.out.println("The constructor is invoked");
			
		}
		AmusementPark(String name,String locationCity){
			this.name=name;
			this.locationCity=locationCity;
		}
		AmusementPark(double areaAcres,double ticketPriceAdult){
			this.areaAcres=areaAcres;
			this.ticketPriceAdult=ticketPriceAdult;
		}
		AmusementPark(int numberOfRides){
			
			this.numberOfRides=numberOfRides;
			
		}
		AmusementPark(boolean hasWaterParkSection){
			System.out.println("The parameterized constructor is invoked");
			
			this.hasWaterParkSection=hasWaterParkSection;
			
		}

}
