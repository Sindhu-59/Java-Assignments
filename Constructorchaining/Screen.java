class Screen{

	int screenNo;
	int seats;
	boolean is3D;
	Movie movie;
	
	public void getScreenInfo(){
	
		System.out.println("The screenNo "+screenNo);
		System.out.println("The capacity of screen "+screenNo);
		System.out.println("The screen has 3D quality "+is3D);
		movie.getMovieInfo();
	
	}
	}
	