class Casino {
    String name;
    String location;
    boolean isOpen24Hours;
    boolean hasHotel;
	int numberOfGames;
    double entryFee;
	
	
	Casino(){
			
			System.out.println("The constructor is invoked");
			
		}
		Casino(String name,String location){
	
			this.name=name;
			this.location=location;
			
		}
		Casino(boolean isOpen24Hours,boolean hasHotel){
			this.isOpen24Hours=isOpen24Hours;
			this.hasHotel=hasHotel;
		}
		Casino(double entryFee){
			this.entryFee=entryFee;
		}
		Casino(int numberOfGames){
			this.numberOfGames=numberOfGames;
			
		}
	
	
}
