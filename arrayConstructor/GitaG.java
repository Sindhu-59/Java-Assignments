class GiTag {
    String name; 
    String category; 
    String geographicalArea; 
    int registrationYear;
    String description; 
    String registeredHolder; 

    GiTag(String name, String category, String geographicalArea){
		 this.name = name;
        this.category = category;
        this.geographicalArea = geographicalArea;
	}
	GiTag(int registrationYear){
		    this.registrationYear = registrationYear;
	}
    GiTag(String description, String registeredHolder) {
       
    
        this.description = description;
        this.registeredHolder = registeredHolder;
    }

    
}
