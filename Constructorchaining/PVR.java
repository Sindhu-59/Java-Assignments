class PVR{

	String name;
	String location;
	int totalScreen;
	boolean hasfoodCourt;
	Screen screen;
	
		
	public void getPVRInfo(){
	
		System.out.println("The name of PVR "+name);
		System.out.println("The location of PVR "+location);
		System.out.println("The totalScreen "+totalScreen);
		System.out.println("The Pvr provide food "+hasfoodCourt);
		screen.getScreenInfo();
	}
}