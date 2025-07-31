class Movie{

	String title;
	String duration;
	String language;
	String genre;
	
	Movie(String title, String duration, String language, String genre){
		
		this.title=title;
		this.duration=duration;
		this.language=language;
		this.genre=genre;
	}

	public void getMovieInfo(){
	
	System.out.println("The movie title "+title);
	System.out.println("The movie duration "+duration);
	System.out.println("The movie language "+language);
	System.out.println("The movie genre "+genre);
	
	}
	}
	