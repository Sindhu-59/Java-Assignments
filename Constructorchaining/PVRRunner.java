class PVRRunner{

	public static void main(String args[]){
		
	Movie movie = new Movie("Athadu","3 hrs","Telugu","thriller");
	
	Screen screen = new Screen();
	screen.screenNo=5;
	screen.seats=100;
	screen.is3D=true;
	screen.movie=movie;
	
	PVR pvr = new PVR();
	pvr.name="Bharath Cinemas";
	pvr.location="Shimoga";
	pvr.totalScreen=6;
	pvr.hasfoodCourt=true;
	pvr.screen=screen;
	
		
	pvr.getPVRInfo();
	}
}