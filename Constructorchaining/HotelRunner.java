class HotelRunner{

	public static void main(String args[]){
		
	Floor floor = new Floor();
	

	Hotel hotel = new Hotel("Taj","Manjunath A R",50,floor);
	
	
	hotel.floor=floor;
	floor.noOfRooms=10;
	floor.isWifiAvail=true;
	
	
	Room room = new Room();
	room.bedType="King Bed";
	room.isBalconyAvailable = true;
	room.bathroomType="Western";
	floor.room = room;
	hotel.getHotelInfo();
	}
}