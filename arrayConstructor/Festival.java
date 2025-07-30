class Festival {
    String name;
    String country;
    String religion;
    String season;
    String mainDeityOrFigure;
    boolean isNationalHoliday;

    Festival(String name, String country){
		this.name = name;
        this.country = country;
		
	}
	Festival(String religion, String season, String mainDeityOrFigure){
		this.religion = religion;
        this.season = season;
        this.mainDeityOrFigure = mainDeityOrFigure;

	}
	Festival(boolean isNationalHoliday) {
        
        this.isNationalHoliday=isNationalHoliday;
    }
}
