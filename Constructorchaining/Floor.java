class Floor{

	int noOfRooms;
	boolean isWifiAvail;
	Room room;
		
	public void getFloorInfo(){
		System.out.println("The noOfRooms is "+noOfRooms);
		System.out.println("The isWifiAvail is "+isWifiAvail);
		
		this.room.getRoomInfo();
	}
	}