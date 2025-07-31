class Hotel{

	String hotelName;
	String ownerName;
	int noOfWorkers;
	
	Floor floor;
	
	Hotel(String hotelName, String ownerName,int noOfWorkers,Floor floor){
	
		this.hotelName=hotelName;
		this.ownerName=ownerName;
		this.noOfWorkers=noOfWorkers;
		this.floor=floor;
	}
	public void getHotelInfo(){
	
		System.out.println("The hotel Name is "+hotelName);
		System.out.println("The owner Name is "+ownerName);
		System.out.println("The no Of Workers are "+noOfWorkers);
		
		
		this.floor.getFloorInfo();
	}
	
}
